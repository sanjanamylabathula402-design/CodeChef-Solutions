# CTMNMF03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Repeating a Message

In this example, we demonstrate how to use a while loop in Java to continuously display a message until a condition is met..

 **When executed, the code will show:** 

```
The process is running...

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:19:16.126Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // Declare a boolean condition
        boolean isRunning = true;

        // While loop to print a message while the condition is true
        while (isRunning) {
            System.out.println("The process is running...");
            
            // Changing the condition to false (breaking the loop)
            isRunning = false; 
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF03)