# ZCUWOB18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Countdown Using a Negative Step

In this example, we demonstrate how to use a  **for loop with a negative step**  to iterate in reverse order. Instead of increasing the loop variable, we decrement it by a specified step to generate a countdown.

 **When executed, the code will show:** 

```
11
9
7
5
3
1 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:39:08.796Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB18)