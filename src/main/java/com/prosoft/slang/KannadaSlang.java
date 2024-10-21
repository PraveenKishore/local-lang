package com.prosoft.slang;

public class KannadaSlang extends Slang {
  @Override public String andKey() { return "matte"; }
  @Override public String classKey() { return "varga"; }
  @Override public String elseKey() { return "illandre"; }
  @Override public String falseKey() { return "illa"; }
  @Override public String forKey() { return "maadtiru"; }
  @Override public String functionKey() { return "kelsa"; }
  @Override public String ifKey() { return "akasmat"; }
  @Override public String nilKey() { return "enilla"; }
  @Override public String orKey() { return "atva"; }
  @Override public String printKey() { return "helu"; }
  @Override public String returnKey() { return "wapas"; }
  @Override public String superKey() { return "boss"; }
  @Override public String thisKey() { return "nanna"; }
  @Override public String trueKey() { return "howdu"; }
  @Override public String varKey() { return "anko"; }
  @Override public String whileKey() { return "ellivargu"; }
  @Override public String clockKey() { return "ghante"; }
  @Override public String initKey() { return "shuru"; }
  @Override public String functionKindKey() { return "function"; }
  @Override public String methodKindKey() { return "method"; }
  @Override public String exitREPLKey() { return "bye"; }

  @Override public String unterminatedStringMessage() { return "String terminate maadi"; }
  @Override public String undefinedVariableMessage(String name) { return "Variable define maadod martra? - '" + name + "'."; }
  @Override public String undefinedPropertyMessage(String property) { return "Property define madilla - '" + property + "'."; }
  @Override public String nativeFnMessage() { return "<Builtin fn guru>"; }
  @Override public String mustBeNumOrStrMessage() { return "Eredu operands strings atva numbers agirbeku"; }
  @Override public String mustBeANumberMessage() { return "Number agirbeku"; }
  @Override public String mustBeNumbersMessage() { return "Numbers argirbeku"; }
  @Override public String superMustBeClassMessage() { return "Use madiro superclass hesru, class ee alla"; }
  @Override public String onlyInstancesHaveFieldsMessage() { return "Instances alli matra fields irbodu."; }
  @Override public String canCallOnlyFunOrClassMessage() { return "Functions na atva classes na matra call madbodu"; }
  @Override public String arityMismatchMessage(int expected, int received) { return "Expect maadiddu " + expected + " arguments but sikkiddu " + received + "."; }
  @Override public String onlyInstancesHavePropsMessage() { return "Instances alli matra properties irbodu"; }
  @Override public String errorInLineMessage(int line, String message) { return "[line " + line + "] Error : " + message; }
  @Override public String errorAtEndMessage(int line, String message) { return "[line " + line + "] Error at end" + ": " + message; }
  @Override public String errorAtMessage(int line, String where, String message) { return "[line " + line + "] Error at '" + where + "'" + ": " + message; }
  @Override public String runtimeErrorMessage(int line) { return "[line " + line + "]";}
  @Override public String functionStringMessage(String name) { return "<fn " + name + ">"; }
  @Override public String instanceStringMessage(String name) { return name + " instance"; }
  @Override public String variableRedeclarationMessage() { return "Ee hesralli already variable declare aagide."; }
  @Override public String classCantInheritItselfMessage() { return "Same class inda inherit madokke agalla."; }
  @Override public String cantReturnFromTopLevelMessage() { return "Illinda return madakke agalla"; }
  @Override public String cantReturnFromInitializerMessage() { return "Initializer inda wapas value kalsakke agalla"; }
  @Override public String cantReadLocalFromInitializerMessage() { return "Local variable na initializer alli refer madakke agalla"; }
  @Override public String cantUseSuperOutsideClassMessage() { return "'boss' na class horage use madakke agalla"; }
  @Override public String cantUseSuperWithoutInheritanceMessage() { return "Ee class ge boss class illa, so 'boss' use madakke agalla"; }
  @Override public String cantUseThisOutsideClassMessage() { return "'nanna' keyword bari class olage use madbodu."; }
  @Override public String expectClassNameMessage() { return "Class hesru beku"; }
  @Override public String expectSuperClassNameMessage() { return "Superclass hesru beku"; }
  @Override public String expectLeftBraceBeforeClassBodyMessage() { return "Expecting '{' class body ginta modlu."; }
  @Override public String expectRightBraceAfterClassBodyMessage() { return "Expecting '}' class body aadmele."; }
  @Override public String expectLeftParenAfterForMessage() { return "'maadtiru' aadmele ')' irbeku."; }
  @Override public String expectSemicolonAfterLoopConditionMessage() { return "Loop condition aadmele ';' beku"; }
  @Override public String expectRightParenAfterForClausesMessage() { return "Clauses aadmele ')' beku"; }
  @Override public String expectLeftParenAfterIfMessage() { return "'akasmat' aadmele '(' beku"; }
  @Override public String expectRightParenAfterIfConditionMessage() { return "'akasmat' condition aadmele ')' beku"; }
  @Override public String expectSemicolonAfterValueMessage() { return "Value aadmele ';' beku"; }
  @Override public String expectSemicolonAfterReturnValueMessage() { return "Wapas aadmele ';' beku."; }
  @Override public String expectVariableNameMessage() { return "Variable hesru haaki."; }
  @Override public String expectSemicolonAfterVariableDeclarationMessage() { return "Variable declaration aadmele ';' irbeku."; }
  @Override public String expectLeftParenAfterWhileMessage() { return "'ellivargu' aadmele '(' irbeku."; }
  @Override public String expectRightParenAfterConditionMessage() { return "Condition aadmele ')' beku"; }
  @Override public String expectSemicolonAfterExpressionMessage() { return "Expression aadmele ';' beku."; }
  @Override public String expectRightParenAfterArgumentsMessage() { return "Arguments aadmele ')' beku."; }
  @Override public String expectPropertyNameAfterDotMessage() { return "'.' aadmele property hesru irbeku."; }
  @Override public String expectExpressionMessage() { return "Expression ellide?"; }
  @Override public String cantHaveMoreThan255ParametersMessage() { return "255 ku jasti parameters irbardu."; }
  @Override public String cantHaveMoreThan255ArgumentsMessage() { return "255 ku jasti arguments irbardu."; }
  @Override public String invalidAssignmentTargetMessage() { return "Invalid assignment bro"; }
  @Override public String expectParamNameMessage() { return "Parameter hesru beku"; }
  @Override public String expectFunctionNameMessage(String kind) { return kind + " hesru beku."; }
  @Override public String expectLeftParenAfterFunctionNameMessage(String kind) { return kind + " aadmele " + "'(' beku"; }
  @Override public String expectRightParenAfterParametersMessage() { return "Parameters aadmele ')' beku."; }
  @Override public String expectLeftBraceBeforeFunctionBodyMessage(String kind) { return kind + " body ku munche '{' irbeku."; }
  @Override public String expectSuperDotMessage() { return "'boss' aadmele '.' irbeku."; }
  @Override public String expectSuperclassMethodNameMessage() { return "Superclass na method hesru beku."; }
  @Override public String expectRightParenAfterExpressionMessage() { return "Expression aadmele ')' irbeku."; }
  @Override public String expectRightBraceAfterBlock() { return "Block aadmele '}' irbeku."; }
  @Override public String exitREPLMessage() { return "Lifeu istene. Exiting REPL now."; }
}
