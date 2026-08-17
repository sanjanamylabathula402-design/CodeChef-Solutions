# ZCUWOB09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Finding the Output

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int start = 2;
        int end = 5;

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:37:41.588Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int start = 5; // Define the starting number
        int end = 9; // Define the ending number

        // Loop to print numbers from start to end
        for (int i = start; i <= end; i++) {
            System.out.println(i + i); // Print the current number
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB09)