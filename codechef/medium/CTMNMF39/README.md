# CTMNMF39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Guess the Correct Output

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 7) {
            if (num % 4 == 0) {
                System.out.println("Terminated at: " + num);
                break;
            }
            System.out.println("Processing: " + num);
            num++;
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:23:42.290Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int num = 10; // Start checking from 10

        while (num <= 20) { // Loop runs until 20
            if (num % 3 == 0) { // Check if num is a multiple of 3
                System.out.println("First multiple of 3 found: " + num);
                break; // Exit the loop once found
            }
            num++; // Increment num to check the next number
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF39)