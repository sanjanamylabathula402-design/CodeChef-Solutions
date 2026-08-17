# ZCUWOB19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Identify the Incorrect Code

```
class Codechef {
    public static void main(String[] args) {
        int start = 20;
        int end = 0;
        int step = 2;

        // Identify the incorrect for loop statement
        for (int i = start; i ___ end; i ___ step) {  
            System.out.println(i);
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:39:16.234Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int start = 11; // Starting number
        int end = 0; // Ending number
        int step = 2; // Step decrement

        // Loop to print numbers in descending order with step -2
        for (int i = start; i >= end; i -= step) {
            System.out.println(i); // Print the current value
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB19)