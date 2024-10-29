package com.prosoft.slang;

import java.util.List;

public abstract class Slang {
  // Abstract methods for keys
  public abstract String andKey();
  public abstract String classKey();
  public abstract String elseKey();
  public abstract String falseKey();
  public abstract String forKey();
  public abstract String functionKey();
  public abstract String ifKey();
  public abstract String nilKey();
  public abstract String orKey();
  public abstract String printKey();
  public abstract String returnKey();
  public abstract String superKey();
  public abstract String thisKey();
  public abstract String trueKey();
  public abstract String varKey();
  public abstract String whileKey();
  public abstract String clockKey();
  public abstract String initKey();
  public abstract String functionKindKey();
  public abstract String methodKindKey();
  public abstract String exitREPLKey();

  public abstract List<String> getKeywords();

  // Abstract methods for error messages
  public abstract String unterminatedStringMessage();
  public abstract String undefinedVariableMessage(String name);
  public abstract String undefinedPropertyMessage(String property);
  public abstract String nativeFnMessage();
  public abstract String mustBeNumOrStrMessage();
  public abstract String mustBeANumberMessage();
  public abstract String mustBeNumbersMessage();
  public abstract String superMustBeClassMessage();
  public abstract String onlyInstancesHaveFieldsMessage();
  public abstract String canCallOnlyFunOrClassMessage();
  public abstract String arityMismatchMessage(int expected, int received);
  public abstract String onlyInstancesHavePropsMessage();
  public abstract String errorInLineMessage(int line, String message);
  public abstract String errorAtEndMessage(int line, String message);
  public abstract String errorAtMessage(int line, String where, String message);
  public abstract String runtimeErrorMessage(int line);
  public abstract String functionStringMessage(String name);
  public abstract String instanceStringMessage(String name);
  public abstract String variableRedeclarationMessage();
  public abstract String classCantInheritItselfMessage();
  public abstract String cantReturnFromTopLevelMessage();
  public abstract String cantReturnFromInitializerMessage();
  public abstract String cantReadLocalFromInitializerMessage();
  public abstract String cantUseSuperOutsideClassMessage();
  public abstract String cantUseSuperWithoutInheritanceMessage();
  public abstract String cantUseThisOutsideClassMessage();
  public abstract String expectClassNameMessage();
  public abstract String expectSuperClassNameMessage();
  public abstract String expectLeftBraceBeforeClassBodyMessage();
  public abstract String expectRightBraceAfterClassBodyMessage();
  public abstract String expectLeftParenAfterForMessage();
  public abstract String expectSemicolonAfterLoopConditionMessage();
  public abstract String expectRightParenAfterForClausesMessage();
  public abstract String expectLeftParenAfterIfMessage();
  public abstract String expectRightParenAfterIfConditionMessage();
  public abstract String expectSemicolonAfterValueMessage();
  public abstract String expectSemicolonAfterReturnValueMessage();
  public abstract String expectVariableNameMessage();
  public abstract String expectSemicolonAfterVariableDeclarationMessage();
  public abstract String expectLeftParenAfterWhileMessage();
  public abstract String expectRightParenAfterConditionMessage();
  public abstract String expectSemicolonAfterExpressionMessage();
  public abstract String expectRightParenAfterArgumentsMessage();
  public abstract String expectPropertyNameAfterDotMessage();
  public abstract String expectExpressionMessage();
  public abstract String cantHaveMoreThan255ParametersMessage();
  public abstract String cantHaveMoreThan255ArgumentsMessage();
  public abstract String invalidAssignmentTargetMessage();
  public abstract String expectParamNameMessage();
  public abstract String expectFunctionNameMessage(String kind);
  public abstract String expectLeftParenAfterFunctionNameMessage(String kind);
  public abstract String expectRightParenAfterParametersMessage();
  public abstract String expectLeftBraceBeforeFunctionBodyMessage(String kind);
  public abstract String expectSuperDotMessage();
  public abstract String expectSuperclassMethodNameMessage();
  public abstract String expectRightParenAfterExpressionMessage();
  public abstract String expectRightBraceAfterBlock();
  public abstract String exitREPLMessage();
}

