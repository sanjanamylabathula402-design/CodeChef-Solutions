# PWTIEX18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example-Default Values of Instance Variable

In Java, instance variables (fields) in a class are automatically assigned  **default values**  if not explicitly initialized. This example demonstrates how  **Java assigns default values**  to different data types in a class.

 **Expected Output:** 

```
Default int value: 0  
Default double value: 0.0  
Default boolean value: false  
Default String value: null  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:40:46.543Z  

```java
// Class demonstrating default field initialization
class Codechef {
    // Step 1: Declare instance variables without initialization
    int intValue;         // Default: 0
    double doubleValue;   // Default: 0.0
    boolean boolValue;    // Default: false
    String stringValue;   // Default: null

    public static void main(String[] args) {
        // Step 2: Create an object of the class
        Codechef obj = new Codechef();

        // Step 3: Print default values of instance variables
        System.out.println("Default int value: " + obj.intValue);
        System.out.println("Default double value: " + obj.doubleValue);
        System.out.println("Default boolean value: " + obj.boolValue);
        System.out.println("Default String value: " + obj.stringValue);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX18)