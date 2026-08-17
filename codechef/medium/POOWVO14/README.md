# POOWVO14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Flag-Controlled While Loop

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        boolean found = false; // Flag variable
        int number = 10; // Starting number

        // Flag-controlled loop: runs until a number greater than 50 is found
        while (!found) {
            System.out.println("Checking: " + number);

            if (number > 50) {
                found = true; // Set flag to true to exit loop
            }

            number++; // Increment number
        }

        System.out.println("First number greater than 50 found: " + number);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:28:23.607Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/POOWVO14)