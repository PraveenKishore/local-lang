package com.prosoft;

import java.util.HashMap;
import java.util.Map;

import static com.prosoft.Slang.*;

class LocalInstance {
  private final Slang slang;
  private LocalClass klass;
  private final Map<String, Object> fields = new HashMap<>();

  LocalInstance(Slang slang, LocalClass klass) {
    this.slang = slang;
    this.klass = klass;
  }

  Object get(Token name) {
    if (fields.containsKey(name.lexeme)) {
      return fields.get(name.lexeme);
    }

    LocalFunction method = klass.findMethod(name.lexeme);
    if (method != null) {
      return method.bind(this);
    }

    throw new RuntimeError(name, slang.undefinedPropertyMessage(name.lexeme));
  }

  void set(Token name, Object value) {
    fields.put(name.lexeme, value);
  }

  @Override
  public String toString() {
    return slang.instanceStringMessage(klass.name);
  }
}