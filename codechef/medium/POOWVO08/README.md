# POOWVO08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Summing Even Numbers

In this example, we demonstrate how to use the  **accumulator pattern**  to sum even numbers from  **2 to 30**  using a `while` loop. This method efficiently accumulates a result over multiple iterations.

 **When executed, the code will show:** 

```
Sum of even numbers from 2 to 30 is: 240

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:27:44.944Z  

```java
class Codechef {
    public static void main(String[] args) {
        int n = 30;       // Define upper limit
        int sum = 0;      // Initialize accumulator
        int number = 2;   // Start from 2 (first even number)

        // Loop through numbers from 2 to n
        while (number <= n) {
            sum += number; // Add even number to sum
            number += 2;   // Increment by 2 to only get even numbers
        }

        System.out.println("Sum of even numbers from 2 to " + n + " is: " + sum);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO08)