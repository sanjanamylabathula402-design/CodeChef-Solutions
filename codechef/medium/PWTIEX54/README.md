# PWTIEX54

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fill in the blanks - Static Members Usage

Complete the missing parts in the code that demonstrates the usage of static variables, methods, and blocks in Java. You need to fill in the blanks to initialize the static variable, implement the static block to modify the static variable, and correctly call the static method in the `main` method.

 **Expected Output:** 

```
Count: 11

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:43:41.567Z  

```java
class Codechef {
    // Static variable
    static int count = 0;  // Static variable initialized to 0

    // Static method
    public static void increment() {
        count++;  // Static method to increment the count
    }

    // Static block
    static {
        count = 10;  // Static block initializes the static variable 'count' to 10
    }

    public static void main(String[] args) {
        // Calling the static method
        Codechef.increment();  // Calling the increment method to increase count by 1
        
        // Printing the static variable
        System.out.println("Count: " + count);  // Prints the value of count, which is now 11
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX54)