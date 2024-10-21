package com.prosoft;

import java.util.List;

interface LocalCallable {
  int arity();
  Object call(Interpreter interpreter, List<Object> arguments);
}
