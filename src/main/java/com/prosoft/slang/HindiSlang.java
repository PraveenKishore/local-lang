package com.prosoft.slang;

public class HindiSlang extends Slang {
  @Override public String andKey() { return "aur"; }
  @Override public String classKey() { return "varg"; }
  @Override public String elseKey() { return "varna"; }
  @Override public String falseKey() { return "galat"; }
  @Override public String forKey() { return "karteraho"; }
  @Override public String functionKey() { return "fun"; }
  @Override public String ifKey() { return "agar"; }
  @Override public String nilKey() { return "ghanta"; }
  @Override public String orKey() { return "yafir"; }
  @Override public String printKey() { return "bolo"; }
  @Override public String returnKey() { return "bhejo"; }
  @Override public String superKey() { return "uperwala"; }
  @Override public String thisKey() { return "khud"; }
  @Override public String trueKey() { return "sahi"; }
  @Override public String varKey() { return "maanle"; }
  @Override public String whileKey() { return "jabtak"; }
  @Override public String clockKey() { return "ghadi"; }
  @Override public String initKey() { return "shuruwad"; }
  @Override public String functionKindKey() { return "function"; }
  @Override public String methodKindKey() { return "method"; }

  @Override public String unterminatedStringMessage() { return "String terminate nahi kiya"; }
  @Override public String undefinedVariableMessage(String name) { return "Variable define nahi kiya hai - '" + name + "'."; }
  @Override public String undefinedPropertyMessage(String property) { return "Property define nahi kiya hai - '" + property + "'."; }
  @Override public String nativeFnMessage() { return "<Builtin fn hai>"; }
  @Override public String mustBeNumOrStrMessage() { return "Dono operands strings ya numbers honi chahiye"; }
  @Override public String mustBeANumberMessage() { return "Number honi chahiye"; }
  @Override public String mustBeNumbersMessage() { return "Numbers honi chahiye bhai"; }
  @Override public String superMustBeClassMessage() { return "Superclass jo use kiya hai, woh class hi nhi hai"; }
  @Override public String onlyInstancesHaveFieldsMessage() { return "Sirf instances mein fields ho sakta hai"; }
  @Override public String canCallOnlyFunOrClassMessage() { return "Sirf functions aur classes ko call kar sakte ho"; }
  @Override public String arityMismatchMessage(int expected, int received) { return "Expect kiya " + expected + " arguments but mila " + received + "."; }
  @Override public String onlyInstancesHavePropsMessage() { return "Only instances have properties."; }
  @Override public String usageMessage() { return "Usage: local -hi [script]"; }
  @Override public String errorInLineMessage(int line, String message) { return "[line " + line + "] Error : " + message; }
  @Override public String errorAtEndMessage(int line, String message) { return "[line " + line + "] Error at end" + ": " + message; }
  @Override public String errorAtMessage(int line, String where, String message) { return "[line " + line + "] Error at '" + where + "'" + ": " + message; }
  @Override public String runtimeErrorMessage(int line) { return "[line " + line + "]";}
  @Override public String functionStringMessage(String name) { return "<fn " + name + ">"; }
  @Override public String instanceStringMessage(String name) { return name + " instance"; }
  @Override public String variableRedeclarationMessage() { return "Isi naam ka variable already define kiya hai"; }
  @Override public String classCantInheritItselfMessage() { return "Khud ko inherit nahi kar sakte ho"; }
  @Override public String cantReturnFromTopLevelMessage() { return "Yahan se return nahi kar sate ho"; }
  @Override public String cantReturnFromInitializerMessage() { return "Initializer se return nahi kar sakte ho"; }
  @Override public String cantReadLocalFromInitializerMessage() { return "Local variable ko initializer mein access nahi kar sakte ho"; }
  @Override public String cantUseSuperOutsideClassMessage() { return "'uper' ko class ke bahar use nahi kar sakte ho"; }
  @Override public String cantUseSuperWithoutInheritanceMessage() { return "Iss class ki superclass nahi hai, so 'uper' use nahi kar sakte ho"; }
  @Override public String cantUseThisOutsideClassMessage() { return "'khud' ko sirf class ke andar use kar sakte ho"; }
  @Override public String expectClassNameMessage() { return "Class ka naam expected hai"; }
  @Override public String expectSuperClassNameMessage() { return "Superclass ka naam expected hai"; }
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
  @Override public String cantHaveMoreThan255ParametersMessage() { return "255 se jyada parameters nahi ho sakta hai"; }
  @Override public String cantHaveMoreThan255ArgumentsMessage() { return "255 se jyada arguments nahi ho sakta hai"; }
  @Override public String invalidAssignmentTargetMessage() { return "assignment invalid hai"; }
  @Override public String expectParamNameMessage() { return "Parameter naam expected hai"; }
  @Override public String expectFunctionNameMessage(String kind) { return kind + " naam expected hai."; }
  @Override public String expectLeftParenAfterFunctionNameMessage(String kind) { return "Expect '(' after " + kind + " name."; }
  @Override public String expectRightParenAfterParametersMessage() { return "Expect ')' after parameters."; }
  @Override public String expectLeftBraceBeforeFunctionBodyMessage(String kind) { return "Expect '{' before " + kind + " body."; }
  @Override public String expectSuperDotMessage() { return "Expect '.' after 'super'."; }
  @Override public String expectSuperclassMethodNameMessage() { return "Expect superclass method name."; }
  @Override public String expectRightParenAfterExpressionMessage() { return "Expect ')' after expression."; }
  @Override public String expectRightBraceAfterBlock() { return "Expect '}' after block."; }
}
