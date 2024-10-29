package com.prosoft.slang;

import java.util.Arrays;
import java.util.List;

public class EnglishSlang extends Slang {
  @Override public String andKey() { return "and"; }
  @Override public String classKey() { return "class"; }
  @Override public String elseKey() { return "else"; }
  @Override public String falseKey() { return "false"; }
  @Override public String forKey() { return "for"; }
  @Override public String functionKey() { return "fun"; }
  @Override public String ifKey() { return "if"; }
  @Override public String nilKey() { return "nil"; }
  @Override public String orKey() { return "or"; }
  @Override public String printKey() { return "print"; }
  @Override public String returnKey() { return "return"; }
  @Override public String superKey() { return "super"; }
  @Override public String thisKey() { return "this"; }
  @Override public String trueKey() { return "true"; }
  @Override public String varKey() { return "var"; }
  @Override public String whileKey() { return "while"; }
  @Override public String clockKey() { return "clock"; }
  @Override public String initKey() { return "init"; }
  @Override public String functionKindKey() { return "function"; }
  @Override public String methodKindKey() { return "method"; }
  @Override public String exitREPLKey() { return "bye"; }

  @Override public List<String> getKeywords() {
    return Arrays.asList(
            andKey(), classKey(), elseKey(), falseKey(), forKey(), functionKey(),
            ifKey(), nilKey(), orKey(), printKey(), returnKey(), superKey(), thisKey(),
            trueKey(), varKey(), whileKey(), clockKey(), initKey(), exitREPLKey()
    );
  }

  @Override public String unterminatedStringMessage() { return "Unterminated string."; }
  @Override public String undefinedVariableMessage(String name) { return "Undefined variable '" + name + "'."; }
  @Override public String undefinedPropertyMessage(String property) { return "Undefined property '" + property + "'."; }
  @Override public String nativeFnMessage() { return "<native fn>"; }
  @Override public String mustBeNumOrStrMessage() { return "Operands must be two numbers or two strings."; }
  @Override public String mustBeANumberMessage() { return "Operand must be a number."; }
  @Override public String mustBeNumbersMessage() { return "Operands must be numbers."; }
  @Override public String superMustBeClassMessage() { return "Superclass must be a class."; }
  @Override public String onlyInstancesHaveFieldsMessage() { return "Only instances have fields."; }
  @Override public String canCallOnlyFunOrClassMessage() { return "Can only call functions and classes."; }
  @Override public String arityMismatchMessage(int expected, int received) { return "Expected " + expected + " arguments but got " + received + "."; }
  @Override public String onlyInstancesHavePropsMessage() { return "Only instances have properties."; }
  @Override public String errorInLineMessage(int line, String message) { return "[line " + line + "] Error : " + message; }
  @Override public String errorAtEndMessage(int line, String message) { return "[line " + line + "] Error at end" + ": " + message; }
  @Override public String errorAtMessage(int line, String where, String message) { return "[line " + line + "] Error at '" + where + "'" + ": " + message; }
  @Override public String runtimeErrorMessage(int line) { return "[line " + line + "]";}
  @Override public String functionStringMessage(String name) { return "<fn " + name + ">"; }
  @Override public String instanceStringMessage(String name) { return name + " instance"; }
  @Override public String variableRedeclarationMessage() { return "Already variable with this name in this scope."; }
  @Override public String classCantInheritItselfMessage() { return "A class can't inherit from itself."; }
  @Override public String cantReturnFromTopLevelMessage() { return "Can't return from top-level code."; }
  @Override public String cantReturnFromInitializerMessage() { return "Can't return a value from an initializer."; }
  @Override public String cantReadLocalFromInitializerMessage() { return "Can't read local variable in its own initializer."; }
  @Override public String cantUseSuperOutsideClassMessage() { return "Can't use 'super' outside of a class."; }
  @Override public String cantUseSuperWithoutInheritanceMessage() { return "Can't use 'super' in a class with no superclass."; }
  @Override public String cantUseThisOutsideClassMessage() { return "Can't use 'this' outside of a class."; }
  @Override public String expectClassNameMessage() { return "Expect class name."; }
  @Override public String expectSuperClassNameMessage() { return "Expect superclass name."; }
  @Override public String expectLeftBraceBeforeClassBodyMessage() { return "Expect '{' before class body."; }
  @Override public String expectRightBraceAfterClassBodyMessage() { return "Expect '}' after class body."; }
  @Override public String expectLeftParenAfterForMessage() { return "Expect '(' after 'for'."; }
  @Override public String expectSemicolonAfterLoopConditionMessage() { return "Expect ';' after loop condition."; }
  @Override public String expectRightParenAfterForClausesMessage() { return "Expect ')' after for clauses."; }
  @Override public String expectLeftParenAfterIfMessage() { return "Expect '(' after 'if'."; }
  @Override public String expectRightParenAfterIfConditionMessage() { return "Expect ')' after if condition."; }
  @Override public String expectSemicolonAfterValueMessage() { return "Expect ';' after value."; }
  @Override public String expectSemicolonAfterReturnValueMessage() { return "Expect ';' after return value."; }
  @Override public String expectVariableNameMessage() { return "Expect variable name."; }
  @Override public String expectSemicolonAfterVariableDeclarationMessage() { return "Expect ';' after variable declaration."; }
  @Override public String expectLeftParenAfterWhileMessage() { return "Expect '(' after 'while'."; }
  @Override public String expectRightParenAfterConditionMessage() { return "Expect ')' after condition."; }
  @Override public String expectSemicolonAfterExpressionMessage() { return "Expect ';' after expression."; }
  @Override public String expectRightParenAfterArgumentsMessage() { return "Expect ')' after arguments."; }
  @Override public String expectPropertyNameAfterDotMessage() { return "Expect property name after '.'."; }
  @Override public String expectExpressionMessage() { return "Expect expression."; }
  @Override public String cantHaveMoreThan255ParametersMessage() { return "Can't have more than 255 parameters."; }
  @Override public String cantHaveMoreThan255ArgumentsMessage() { return "Can't have more than 255 arguments."; }
  @Override public String invalidAssignmentTargetMessage() { return "Invalid assignment target."; }
  @Override public String expectParamNameMessage() { return "Expect parameter name."; }
  @Override public String expectFunctionNameMessage(String kind) { return "Expect " + kind + " name."; }
  @Override public String expectLeftParenAfterFunctionNameMessage(String kind) { return "Expect '(' after " + kind + " name."; }
  @Override public String expectRightParenAfterParametersMessage() { return "Expect ')' after parameters."; }
  @Override public String expectLeftBraceBeforeFunctionBodyMessage(String kind) { return "Expect '{' before " + kind + " body."; }
  @Override public String expectSuperDotMessage() { return "Expect '.' after 'super'."; }
  @Override public String expectSuperclassMethodNameMessage() { return "Expect superclass method name."; }
  @Override public String expectRightParenAfterExpressionMessage() { return "Expect ')' after expression."; }
  @Override public String expectRightBraceAfterBlock() { return "Expect '}' after block."; }
  @Override public String exitREPLMessage() { return "Exiting REPL. Take care!"; }
}
