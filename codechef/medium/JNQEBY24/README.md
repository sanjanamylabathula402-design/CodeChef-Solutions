# JNQEBY24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:50:00.763Z  

```java
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