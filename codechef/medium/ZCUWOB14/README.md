# ZCUWOB14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - For Loop with Multiplication Step

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        for (int power = 10; power <= 50; power *= 2) {
            System.out.println(power);
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:38:38.347Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int start = 1;  // Starting value
        int end = 10;   // Ending value
        int step = 3;   // Step increment

        // Loop from start to end, increasing by step in each iteration
        for (int i = start; i <= end; i += step) {
            System.out.println(i); // Print the current value of i
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB14)