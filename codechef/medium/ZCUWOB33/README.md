# ZCUWOB33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Skip multiples of 3 in a range

In this example, we demonstrate how to use a for loop with the continue statement to skip numbers that are multiples of 3.

 **When executed, the code will show:** 

```
1
5
13
17 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:41:37.240Z  

```java
class Codechef {
    public static void main(String[] args) {
        int start = 1; // Starting number
        int end = 20;  // Ending number

        // Loop from start to end with a step value of 4
        for (int i = start; i <= end; i += 4) { // Increment by 4 in each iteration
            
            // Check if the number is a multiple of 3
            if (i % 3 == 0) { 
                continue; // Skip multiples of 3 and move to the next iteration
            }

            System.out.println(i); // Print numbers that are not multiples of 3
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB33)