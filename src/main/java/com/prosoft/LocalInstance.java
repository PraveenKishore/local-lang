package com.prosoft;

import java.util.HashMap;
import java.util.Map;

import static com.prosoft.Slang.*;

class LocalInstance {
  private LocalClass klass;
  private final Map<String, Object> fields = new HashMap<>();

  LocalInstance(LocalClass klass) {
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

    throw new RuntimeError(name, undefinedPropertyMessage(name.lexeme));
  }

  void set(Token name, Object value) {
    fields.put(name.lexeme, value);
  }

  @Override
  public String toString() {
    return instanceStringMessage(klass.name);
  }
}