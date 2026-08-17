# ZCUWOB13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Range with Step

In this example, we demonstrate how to use a  **for loop with a step value**  to iterate through a sequence of numbers, skipping values based on the defined step.

 **When executed, the code will show:** 

```
1  
4  
7  
10  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:38:27.762Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB13)