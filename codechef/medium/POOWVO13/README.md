# POOWVO13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Finding the First Multiple of 7

In this example, we demonstrate how to use a  **flag-controlled loop**  to find the first number in a sequence that is a  **multiple of 7**. The loop continues running until the flag is updated to indicate that a multiple has been found.

 **When executed, the code will show:** 

```
Checking: 10  
Checking: 11  
Checking: 12  
Checking: 13  
Checking: 14  
First multiple of 7 found: 14  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:28:11.125Z  

```java
class Codechef {
    public static void main(String[] args) {
        boolean foundMultiple = false; // Flag to control loop
        int start = 10; // Starting number

        // Flag-controlled loop: Runs until the flag is set to true
        while (!foundMultiple) {
            System.out.println("Checking: " + start);

            // Check if the number is a multiple of 7
            if (start % 7 == 0) {
                foundMultiple = true; // Set flag to true to exit loop
                System.out.println("First multiple of 7 found: " + start);
            } else {
                start++; // Only increment if a multiple is not found
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO13)