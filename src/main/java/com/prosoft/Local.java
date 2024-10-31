package com.prosoft;

import com.prosoft.slang.HindiSlang;
import com.prosoft.slang.KannadaSlang;
import com.prosoft.slang.Slang;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Stack;

public class Local {
  private static Interpreter interpreter;
  static boolean hadError = false;
  static boolean hadRuntimeError = false;

  public static void main(String[] args) throws IOException {
    if (args.length > 1) {
      System.out.println("Usage: local [-hi/-ka] <file path>");
      System.exit(64);
    }

    Slang slang = null;
    boolean runPrompt = true;

    if (args.length == 1) {
      String arg = args[0].toLowerCase();
      switch (arg) {
        case "-v" -> printVersionAndExit();
        case "-hi" -> slang = new HindiSlang();
        case "-ka" -> slang = new KannadaSlang();
        default -> {
          // Check if it's a file
          File file = new File(arg);
          if (!file.isFile() || !file.exists()) {
            System.out.println("Invalid slang or file path");
            System.exit(64);
          }

          String fileName = file.getName();
          if (fileName.endsWith(".hl")) {
            slang = new HindiSlang();
          } else if (fileName.endsWith(".kl")) {
            slang = new KannadaSlang();
          } else {
            System.out.println("Invalid file extension");
            System.exit(64);
          }
          runPrompt = false; // Do not run prompt if file is provided
        }
      }
    } else {
      slang = new HindiSlang(); // Default to Hindi slang
    }

    interpreter = new Interpreter(slang);
    if (runPrompt) {
      String lang;
      if(slang instanceof KannadaSlang) {
        lang = "Kannada";
      } else {
        lang = "Hindi";
      }
      System.out.println("Welcome: local-lang running REPL in " + lang + " slang (" + getVersion() + ")");
      runREPL();
    } else {
      runFile(args[0]);
    }
  }

  private static void runFile(String path) throws IOException {
    byte[] bytes = Files.readAllBytes(Paths.get(path));
    run(new String(bytes, Charset.defaultCharset()));
    if (hadError) {
      System.exit(65);
    }
    if (hadRuntimeError) {
      System.exit(70);
    }
  }

  private static void runREPL() {
    try {
      Terminal terminal = TerminalBuilder.terminal();
      LineReader reader = LineReaderBuilder.builder()
              .terminal(terminal)
              .completer(new StringsCompleter(interpreter.slang.getKeywords()))
              .build();

      Stack<Character> braceStack = new Stack<>();
      StringBuilder inputBuffer = new StringBuilder();

      while (true) {
        String line = reader.readLine(braceStack.isEmpty() ? ">>> " : "... ");
        if (line == null) {
          break;
        }
        inputBuffer.append(line).append("\n"); // Store line for later interpretation

        for (char ch : line.toCharArray()) {
          if (ch == '(' || ch == '{') {
            braceStack.push(ch);
          } else if (ch == ')' || ch == '}') {
            if (braceStack.isEmpty() || !isMatchingBrace(braceStack.peek(), ch)) {
              System.err.println("Unmatched closing brace: " + ch);

              // Reset all inputs on error
              inputBuffer.setLength(0);
              braceStack.clear();

              break;
            }
            braceStack.pop();
          }
        }

        String inp = inputBuffer.toString().trim();
        if (braceStack.isEmpty() && !inp.isEmpty()) {
          // System.out.println("Running line: " + inp.replaceAll("\n", ""));

          if (inp.trim().equalsIgnoreCase(interpreter.slang.exitREPLKey())) {
            System.out.println(interpreter.slang.exitREPLMessage());
            System.exit(0);
          }

          run(inp);
          hadError = false;
          reader.getHistory().add(inp);
          inputBuffer.setLength(0);
        }

      }
    } catch (Exception e) {
      System.out.println(interpreter.slang.exitREPLMessage());
      System.exit(0);
    }
  }

  private static void runLegacyPrompt() throws IOException {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);

    for (;;) {
      System.out.print("> ");
      String line = reader.readLine();
      if (line == null) {
        break;
      }
      if (line.equalsIgnoreCase(interpreter.slang.exitREPLKey())) {
        System.out.println(interpreter.slang.exitREPLMessage());
        System.exit(0);
      }
      run(line);
      hadError = false; // Reset for every prompt, so we don't kill the session
    }
  }

  private static void run(String source) {
    Scanner scanner = new Scanner(interpreter.slang, source);
    List<Token> tokens = scanner.scanTokens();
    Parser parser = new Parser(interpreter.slang, tokens);
    List<Stmt> statements = parser.parse();
    // Stop if there was a syntax error.
    if (hadError) {
      return;
    }

    Resolver resolver = new Resolver(interpreter);
    resolver.resolve(statements);

    // Stop if there was a resolution error.
    if (hadError) {
      return;
    }

    interpreter.interpret(statements);
  }

  private static boolean isMatchingBrace(char open, char close) {
    return (open == '(' && close == ')') || (open == '{' && close == '}');
  }

  static void error(int line, String message) {
    report(interpreter.slang.errorInLineMessage(line, message));
  }

  private static void report(String message) {
    System.err.println(message);
    hadError = true;
  }

  static void error(Token token, String message) {
    if (token.type == TokenType.EOF) {
      report(interpreter.slang.errorAtEndMessage(token.line, message));
    } else {
      report(interpreter.slang.errorAtMessage(token.line, token.lexeme, message));
    }
  }

  static void runtimeError(RuntimeError error) {
    System.err.println(error.getMessage() + "\n" + interpreter.slang.runtimeErrorMessage(error.token.line));
    hadRuntimeError = true;
  }

  static void printVersionAndExit() {
    System.out.println("local-lang " + getVersion());
    System.exit(0);
  }

  static String getVersion() {
    String version = Local.class.getPackage().getImplementationVersion();
    if (version == null) {
      version = "v1.0.0";
    }
    return version;
  }
}