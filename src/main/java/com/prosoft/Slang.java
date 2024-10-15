package com.prosoft;

public class Slang {
  public static String andKey() { return "and"; }
  public static String classKey() { return "class"; }
  public static String elseKey() { return "else"; }
  public static String falseKey() { return "false"; }
  public static String forKey() { return "for"; }
  public static String functionKey() { return "fun"; }
  public static String ifKey() { return "if"; }
  public static String nilKey() { return "nil"; }
  public static String orKey() { return "or"; }
  public static String printKey() { return "print"; }
  public static String returnKey() { return "return"; }
  public static String superKey() { return "super"; }
  public static String thisKey() { return "this"; }
  public static String trueKey() { return "true"; }
  public static String varKey() { return "var"; }
  public static String whileKey() { return "while"; }
  public static String clockKey() { return "clock"; }
  public static String initKey() { return "init"; }

  public static String unterminatedStringMessage() { return "Unterminated string."; }
  public static String undefinedVariableMessage(String name) { return "Undefined variable '" + name + "'."; }
  public static String undefinedPropertyMessage(String property) { return "Undefined property '" + property + "'."; }
  public static String nativeFnMessage() { return "<native fn>"; }
  public static String mustBeNumOrStrMessage() { return "Operands must be two numbers or two strings."; }
  public static String mustBeANumberMessage() { return "Operand must be a number."; }
  public static String mustBeNumbersMessage() { return "Operands must be numbers."; }
  public static String superMustBeClassMessage() { return "Superclass must be a class."; }
  public static String onlyInstancesHaveFieldsMessage() { return "Only instances have fields."; }
  public static String canCallOnlyFunOrClassMessage() { return "Can only call functions and classes."; }
  public static String arityMismatchMessage(int expected, int received) { return "Expected " + expected + " arguments but got " + received + "."; }
  public static String onlyInstancesHavePropsMessage() { return "Only instances have properties."; }
  public static String usageMessage() { return "Usage: local [script]"; }
  public static String errorInLineMessage(int line, String message) { return "[line " + line + "] Error : " + message; }
  public static String errorAtEndMessage(int line, String message) { return "[line " + line + "] Error at end" + ": " + message; }
  public static String errorAtMessage(int line, String where, String message) { return "[line " + line + "] Error at '" + where + "'" + ": " + message; }
  public static String runtimeErrorMessage(int line) { return "[line " + line + "]";}
  public static String functionStringMessage(String name) { return "<fn " + name + ">"; }
  public static String instanceStringMessage(String name) { return name + " instance"; }
  public static String variableRedeclarationMessage() { return "Already variable with this name in this scope."; }
  public static String classCantInheritItselfMessage() { return "A class can't inherit from itself."; }
  public static String cantReturnFromTopLevelMessage() { return "Can't return from top-level code."; }
  public static String cantReturnFromInitializerMessage() { return "Can't return a value from an initializer."; }
  public static String cantReadLocalFromInitializerMessage() { return "Can't read local variable in its own initializer."; }
  public static String cantUseSuperOutsideClassMessage() { return "Can't use 'super' outside of a class."; }
  public static String cantUseSuperWithoutInheritanceMessage() { return "Can't use 'super' in a class with no superclass."; }
  public static String cantUseThisOutsideClassMessage() { return "Can't use 'this' outside of a class."; }
}
