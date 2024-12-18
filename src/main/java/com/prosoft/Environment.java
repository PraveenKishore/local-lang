package com.prosoft;

import com.prosoft.slang.Slang;

import java.util.HashMap;
import java.util.Map;

public class Environment {
  private final Slang slang;
  final Environment enclosing;
  private final Map<String, Object> values = new HashMap<>();

  Environment(Slang slang) {
    this.slang = slang;
    enclosing = null;
  }

  Environment(Environment enclosing) {
    this.slang = enclosing.slang;
    this.enclosing = enclosing;
  }

  Object get(Token name) {
    if (values.containsKey(name.lexeme)) {
      return values.get(name.lexeme);
    }
    if (enclosing != null) {
      return enclosing.get(name);
    }
    throw new RuntimeError(name, slang.undefinedVariableMessage(name.lexeme));
  }

  void define(String name, Object value) {
    values.put(name, value);
  }

  Environment ancestor(int distance) {
    Environment environment = this;
    for (int i = 0; i < distance; i++) {
      environment = environment.enclosing;
    }
    return environment;
  }

  Object getAt(int distance, String name) {
    return ancestor(distance).values.get(name);
  }

  void assignAt(int distance, Token name, Object value) {
    ancestor(distance).values.put(name.lexeme, value);
  }

  void assign(Token name, Object value) {
    if (values.containsKey(name.lexeme)) {
      values.put(name.lexeme, value);
      return;
    }
    if (enclosing != null) {
      enclosing.assign(name, value);
      return;
    }
    throw new RuntimeError(name, slang.undefinedVariableMessage(name.lexeme));
  }
}
