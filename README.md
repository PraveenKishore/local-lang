# local-lang
A toy programming language that uses ಕನ್ನಡ and हिन्दी slangs.

## About
local-lang is a simple, dynamically-typed and interpreted programming language. It combines features from languages like JavaScript, Python, and Java to create a straightforward yet powerful language. Well, it's time that there's a programming language that uses kannada/hindi slangs, haha.

### Features
* **Dynamic Typing**: Variables can hold values of any type.
* **Automatic Memory Management**: Garbage collection handles memory allocation.
* **First-class Functions**: Functions are treated as values.
* **Closures**: Functions can access variables from their outer scope.
* **Classes**: Object-oriented programming with single inheritance.
* **Lexical Scoping**: Variable scoping is determined by the structure of the code.

### Building
```
mvn package
```

### To execute interpreter
* To execute in REPL mode - Run the Local class without any arguments. Or run `java -jar local-lang.jar`
* To execute scripts - Run Local class with the path to script as argument. Or run `java -jar local-lang.jar <path to script>`

### Documentation
* For Hindi documentation - [Click here](/docs-hi.md)
* For Kannada documentation - [Click here](/docs-ka.md)