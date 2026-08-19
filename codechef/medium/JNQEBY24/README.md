# JNQEBY24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Choose the Correct Code

Which of the following code snippets demonstrates correct method overloading in Java?

A.

```
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(int a, int b) {
        return a + b;
    }
}

```

B.

```
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

```

C.

```
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(double a, double b) {
        return a + b;
    }
}

```

D.

```
class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int x, int y) {
        System.out.println(x + y);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:50:11.262Z  

```cpp
// Class with overloaded greet() methods
class Greet {

    // Method with no parameters
    void greet() {
        System.out.println("Hello! Welcome to Codechef.");
    }

    // Overloaded method with one String parameter
    void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to Codechef.");
    }

    // Overloaded method with two parameters: String and int
    void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old. Welcome to Codechef.");
    }
}

// Main class to run the program
class Codechef {
    public static void main(String[] args) {
        // Create an object of Greet
        Greet obj = new Greet();

        // Call greet() with no arguments
        obj.greet();               // Output: Hello! Welcome to Codechef.

        // Call greet() with one argument
        obj.greet("Mike");         // Output: Hello, Mike! Welcome to Codechef.

        // Call greet() with two arguments
        obj.greet("Priss", 25);    // Output: Hello, Priss! You are 25 years old. Welcome to Codechef.
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JNQEBY24)