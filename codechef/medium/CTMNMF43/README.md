# CTMNMF43

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Skipping Multiples in While Loop

In this example, we demonstrate how to use a  **while loop with continue**  to iterate through numbers from  **1 to 10**, while skipping  **even numbers (multiples of 2).** 

 **When executed, the code will show:** 

```
1  
3  
5  
7  
9  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:24:31.540Z  

```java
class Codechef {
    public static void main(String[] args) {
        int i = 1; // Initialize counter

        while (i <= 10) { // Loop from 1 to 10
            if (i % 2 == 0) { // Skip multiples of 2
                i++; // Move to the next number
                continue; // Skip this iteration
            }
            System.out.println(i); // Print odd numbers
            i++; // Increment counter
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF43)