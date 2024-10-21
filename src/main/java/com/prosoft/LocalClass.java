package com.prosoft;

import com.prosoft.slang.Slang;

import java.util.List;
import java.util.Map;

class LocalClass implements LocalCallable {
  private final Slang slang;
  final String name;
  final LocalClass superclass;
  private final Map<String, LocalFunction> methods;

  LocalClass(Slang slang, String name, LocalClass superclass, Map<String, LocalFunction> methods) {
    this.slang = slang;
    this.superclass = superclass;
    this.name = name;
    this.methods = methods;
  }

  LocalFunction findMethod(String name) {
    if (methods.containsKey(name)) {
      return methods.get(name);
    }
    if (superclass != null) {
      return superclass.findMethod(name);
    }
    return null;
  }

  @Override
  public Object call(Interpreter interpreter, List<Object> arguments) {
    LocalInstance instance = new LocalInstance(slang,this);
    LocalFunction initializer = findMethod(slang.initKey());
    if (initializer != null) {
      initializer.bind(instance).call(interpreter, arguments);
    }
    return instance;
  }

  @Override
  public int arity() {
    LocalFunction initializer = findMethod(slang.initKey());
    if (initializer == null) {
      return 0;
    }
    return initializer.arity();
  }

  @Override
  public String toString() {
    return name;
  }
}