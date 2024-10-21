// Variables and printing
var name = "Local";
print name;  // Output: Local

// Functions
fun sayHello() {
    print "Hello, World!";
}
sayHello();  // Output: Hello, World!

// Control flow
if (5 > 3) {
    print "5 is greater than 3!";
} else {
    print "3 is greater than 5!";
}

// Classes and inheritance
class Animal {
    speak() {
        print "Generic animal sound!";
    }
}

class Dog < Animal {
    speak() {
        print "Woof!";
    }
}

var myDog = Dog();
myDog.speak();  // Output: Woof!

// While loop example
var i = 0;
while (i < 5) {
    print i;  // Output: 0, 1, 2, 3, 4
    i = i + 1;
}

// For loop example
for (var j = 0; j < 5; j = j + 1) {
    print j;  // Output: 0, 1, 2, 3, 4
}

// For loop without initialization and increment (like a C-style while loop)
var k = 0;
for (; k < 5;) {
    print k;  // Output: 0, 1, 2, 3, 4
    k = k + 1;
}
