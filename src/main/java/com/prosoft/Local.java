package com.prosoft;

import com.prosoft.slang.HindiSlang;
import com.prosoft.slang.Slang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Local {
  private static final Slang slang = new HindiSlang();
  private static final Interpreter interpreter = new Interpreter(slang);
  static boolean hadError = false;
  static boolean hadRuntimeError = false;

  public static void main(String[] args) throws IOException {
    if (args.length > 1) {
      System.out.println(slang.usageMessage());
      System.exit(64);
    } else if (args.length == 1) {
      runFile(args[0]);
    } else {
      runPrompt();
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
    Scanner scanner = new Scanner(slang, source);
    List<Token> tokens = scanner.scanTokens();
    Parser parser = new Parser(slang, tokens);
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
    report(slang.errorInLineMessage(line, message));
  }

  private static void report(String message) {
    System.err.println(message);
    hadError = true;
  }

  static void error(Token token, String message) {
    if (token.type == TokenType.EOF) {
      report(slang.errorAtEndMessage(token.line, message));
    } else {
      report(slang.errorAtMessage(token.line, token.lexeme, message));
    }
  }

  static void runtimeError(RuntimeError error) {
    System.err.println(error.getMessage() + "\n" + slang.runtimeErrorMessage(error.token.line));
    hadRuntimeError = true;
  }
}