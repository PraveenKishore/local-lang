## local-lang Documentation (Kannada slang)

### Variables
Declare variables using `anko`. Variables can be strings, numbers, boolean or nil. Nil values are represented by `enilla`.

```
anko lifeu = "istene";
anko hakki = 2;
anko ready = howdu;
anko nidde = illa;

anko a = 5;
anko b = 10.5;
anko c = (a + b) * a / (1 * hakki);
```

### Built-ins
Use `helu` to print anything to console. Strings can be concatenated with `+` and if arithmetic is present while printing, they will be evaluated first.

```
anko plan = "Thale bachkoli, powdr haakoli";
helu plan;
{
  anko plan = "Shiva anta hogtairu roadinali";
  helu plan;
}
helu 400 + 20;
helu "neeralli " + " sanna " + " ale";
```

### Functions
Define and call functions with `kelsa`. These are very similar to functions in C or java.

```
kelsa rcb() {
  anko success = howdu;
  wapas "Ee sala cup namde";
}
anko line = rcb();
helu line;
```

### Conditionals
You can define if-else using the `akasmat` and `illandre` keywords.

```
anko team = "RCB";
anko varsha = "2024";
akasmat (varsha == "2024") {
  helu "Ee sala cup namde";
} illandre {
  helu "Mundin sala cup namde";
}
```

### Loops
Define for and while loops with `karteraho` and `jabtak`.

```
anko lifeu = "istene";
anko janma = 0;
ellivargu (lifeu == "istene") {
  helu "Hindina janmada rahasya tilko";
  helu "Mundina janmada bhavishya tilko";
  akasmat (janma == 1) {
    lifeu = "hingene";
  }
  janma = janma + 1;
}

maadtiru (anko j = 0; j < 5; j = j + 1) {
  helu j;
}
```

### Classes & Inheritance
Define classes with `varga` and create objects calling the class. Extend the classes with `<`.

```
varga Rajkumar {
  dialog() {
    helu "Abhimaani devru";
  }
}

varga Puneet < Rajkumar {
  dialog() { // This overrides the parent function
    helu "Abhimaanigale nammane devru";
  }
}

anko hero = Puneet();
hero.dialog();
```