# PWTIEX54

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Static Members in Java

In this example, we will demonstrate the usage of static members in Java. The program will define a class with a static variable, static method, and static block. We will observe how static members can be accessed without creating an object of the class.

 **Expected Output:** 

```
Static Block executed
Static Variable: 10
Static Method called

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:43:27.277Z  

```java
class Codechef {
    
    // Static variable: Shared by all instances of the class
    static int staticVar = 10;

    // Static method: Can be called without creating an instance of the class
    static void staticMethod() {
        System.out.println("Static Method called");
    }

    // Static block: Executes once when the class is loaded
    static {
        System.out.println("Static Block executed");
    }

    public static void main(String[] args) {
        // Accessing static variable directly without creating an object
        System.out.println("Static Variable: " + staticVar);

        // Calling static method without creating an object of the class
        staticMethod();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX54)