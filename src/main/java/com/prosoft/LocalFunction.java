package com.prosoft;

import java.util.List;

import static com.prosoft.Slang.*;

class LocalFunction implements LocalCallable {
  private final Slang slang;
  private final Stmt.Function declaration;
  private final Environment closure;
  private final boolean isInitializer;

  LocalFunction(Slang slang, Stmt.Function declaration, Environment closure, boolean isInitializer) {
    this.slang = slang;
    this.isInitializer = isInitializer;
    this.closure = closure;
    this.declaration = declaration;
  }

  LocalFunction bind(LocalInstance instance) {
    Environment environment = new Environment(closure);
    environment.define(slang.thisKey(), instance);
    return new LocalFunction(slang, declaration, environment, isInitializer);
  }

  @Override
  public int arity() {
    return declaration.params.size();
  }

  @Override
  public Object call(Interpreter interpreter, List<Object> arguments) {
    Environment environment = new Environment(closure);
    for (int i = 0; i < declaration.params.size(); i++) {
      environment.define(declaration.params.get(i).lexeme, arguments.get(i));
    }
    try {
      interpreter.executeBlock(declaration.body, environment);
    } catch (Return returnValue) {
      return returnValue.value;
    }
    if (isInitializer) {
      return closure.getAt(0, slang.thisKey());
    }
    return null;
  }

  @Override
  public String toString() {
    return slang.functionStringMessage(declaration.name.lexeme);
  }
}
