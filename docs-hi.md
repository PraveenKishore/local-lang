## local-lang Documentation (Hindi slang)

### Variables
Declare variables using `maanle`. Variables can be strings, numbers, boolean or nil. Nil values are represented by `ghanta`.

```
maanle zingadi = "safar";
maanle pal = 2;
maanle chalo = sahi;
maanle rukh = galat;

maanle a = 5;
maanle b = 10.5;
maanle c = (a + b) * a / (1 * pal);
```

### Built-ins
Use `bolo` to print anything to console. Strings can be concatenated with `+` and if arithmetic is present while printing, they will be evaluated first.

```
maanle plan = "Ikkis din main paise double";
bolo plan;
{
  maanle plan = "Do din mein paise double!";
  bolo plan;
}
bolo 400 + 20;
bolo "dil" + "dosti" + "dhadkan";
```

### Functions
Define and call functions with `fun`. These are very similar to functions in C or java.

```
fun hera_pheri_logic(paisa, kharcha) {
  // Hera Pheri logic: Paise ka kya karna hai, bhai?
  bhejo paisa - kharcha;
}
maanle bacha = hera_pheri_logic(420, 20);
bolo bacha;
```

### Conditionals
You can define if-else using the `agar` and `varna` keywords.

```
maanle party = sahi;
agar (party) {
  bolo "Aaj botlan khullan do. Daaru shaaru ghullan do";
} varna {
  bolo "Aunty police bula legi.";
}
```

### Loops
Define for and while loops with `karteraho` and `jabtak`.

```
maanle hai_jaan = 2;
jabtak (hai_jaan > 0) {
  bolo hai_jaan;
  hai_jaan = hai_jaan - 1;
}

karteraho (maanle j = 0; j < 5; j = j + 1) {
  bolo j;
}
```

### Classes & Inheritance
Define classes with `varg` and create objects calling the class. Extend the classes with `<`.

```
varg Rapper {
  perform() {
    bolo "Rapper hoon mein";
  }
}

varg MCStan < Rapper {
  perform() { // This overrides the parent function
    bolo "Apna time ayega!";
  }
}

maanle gully_boy = MCStan();
gully_boy.perform();
```