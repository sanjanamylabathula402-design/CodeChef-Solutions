# ZCUWOB09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Range Using For Loop

In this example, we demonstrate how to use a for loop with a defined start and end range to iterate through a sequence of numbers, printing twice the value of each number instead of the number itself in each iteration.

 **When executed, the code will show:** 

```
10
12
14
16
18  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:37:29.009Z  

```java
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