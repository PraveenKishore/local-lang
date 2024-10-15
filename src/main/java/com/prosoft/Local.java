package com.prosoft;

import com.prosoft.slang.EnglishSlang;
import com.prosoft.slang.HindiSlang;
import com.prosoft.slang.Slang;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Local {
  private static Interpreter interpreter;
  static boolean hadError = false;
  static boolean hadRuntimeError = false;

  public static void main(String[] args) throws IOException {
    if (args.length > 1) {
      System.out.println("Usage: local [-hi/-en] <file path>");
      System.exit(64);
    }

    Slang slang = null;
    boolean runPrompt = true;

    if (args.length == 1) {
      String arg = args[0].toLowerCase();
      if (arg.equals("-hi")) {
        slang = new HindiSlang();
      } else if (arg.equals("-en")) {
        slang = new EnglishSlang();
      } else {
        // Check if it's a file
        File file = new File(arg);
        if (!file.isFile() || !file.exists()) {
          System.out.println("Invalid switch or file path");
          System.exit(64);
        }

        String fileName = file.getName();
        if (fileName.endsWith(".hl")) {
          slang = new HindiSlang();
        } else if (fileName.endsWith(".el")) {
          slang = new EnglishSlang();
        } else {
          System.out.println("Invalid file extension");
          System.exit(64);
        }
        runPrompt = false; // Do not run prompt if file is provided
      }
    } else {
      slang = new HindiSlang(); // Default to Hindi slang
    }

    interpreter = new Interpreter(slang);
    if (runPrompt) {
      System.out.println("Welcome: local-lang running REPL in " + (slang instanceof HindiSlang ? "Hindi" : "English") + " slang");
      runPrompt();
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

  private static void runPrompt() throws IOException {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);

    for (;;) {
      System.out.print("> ");
      String line = reader.readLine();
      if (line == null) {
        break;
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

    /*for(Stmt stmt: statements) {
      System.out.println(new AstPrinter().print(stmt));
    }*/

    interpreter.interpret(statements);
    // System.out.println(new AstPrinter().print(expression));
  }

//  static void error(int line, String message) {
//    report(line, "", message);
//  }
//
//  private static void report(int line, String where, String message) {
//    System.err.println("[line " + line + "] Error " + where + ": " + message);
//    hadError = true;
//  }
//
//  static void error(Token token, String message) {
//    if (token.type == TokenType.EOF) {
//      report(token.line, " at end", message);
//    } else {
//      report(token.line, " at '" + token.lexeme + "'", message);
//    }
//  }

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
}