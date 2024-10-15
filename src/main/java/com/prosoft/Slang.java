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
  public static String functionKindKey() { return "function"; }
  public static String methodKindKey() { return "method"; }

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
  public static String expectClassNameMessage() { return "Expect class name."; }
  public static String expectSuperClassNameMessage() { return "Expect superclass name."; }
  public static String expectLeftBraceBeforeClassBodyMessage() { return "Expect '{' before class body."; }
  public static String expectRightBraceAfterClassBodyMessage() { return "Expect '}' after class body."; }
  public static String expectLeftParenAfterForMessage() { return "Expect '(' after 'for'."; }
  public static String expectSemicolonAfterLoopConditionMessage() { return "Expect ';' after loop condition."; }
  public static String expectRightParenAfterForClausesMessage() { return "Expect ')' after for clauses."; }
  public static String expectLeftParenAfterIfMessage() { return "Expect '(' after 'if'."; }
  public static String expectRightParenAfterIfConditionMessage() { return "Expect ')' after if condition."; }
  public static String expectSemicolonAfterValueMessage() { return "Expect ';' after value."; }
  public static String expectSemicolonAfterReturnValueMessage() { return "Expect ';' after return value."; }
  public static String expectVariableNameMessage() { return "Expect variable name."; }
  public static String expectSemicolonAfterVariableDeclarationMessage() { return "Expect ';' after variable declaration."; }
  public static String expectLeftParenAfterWhileMessage() { return "Expect '(' after 'while'."; }
  public static String expectRightParenAfterConditionMessage() { return "Expect ')' after condition."; }
  public static String expectSemicolonAfterExpressionMessage() { return "Expect ';' after expression."; }
  public static String expectRightParenAfterArgumentsMessage() { return "Expect ')' after arguments."; }
  public static String expectPropertyNameAfterDotMessage() { return "Expect property name after '.'."; }
  public static String expectExpressionMessage() { return "Expect expression."; }
  public static String cantHaveMoreThan255ParametersMessage() { return "Can't have more than 255 parameters."; }
  public static String cantHaveMoreThan255ArgumentsMessage() { return "Can't have more than 255 arguments."; }
  public static String invalidAssignmentTargetMessage() { return "Invalid assignment target."; }
  public static String expectParamNameMessage() { return "Expect parameter name."; }
  public static String expectFunctionNameMessage(String kind) { return "Expect " + kind + " name."; }
  public static String expectLeftParenAfterFunctionNameMessage(String kind) { return "Expect '(' after " + kind + " name."; }
  public static String expectRightParenAfterParametersMessage() { return "Expect ')' after parameters."; }
  public static String expectLeftBraceBeforeFunctionBodyMessage(String kind) { return "Expect '{' before " + kind + " body."; }
  public static String expectSuperDotMessage() { return "Expect '.' after 'super'."; }
  public static String expectSuperclassMethodNameMessage() { return "Expect superclass method name."; }
  public static String expectRightParenAfterExpressionMessage() { return "Expect ')' after expression."; }
  public static String expectRightBraceAfterBlock() { return "Expect '}' after block."; }
}
