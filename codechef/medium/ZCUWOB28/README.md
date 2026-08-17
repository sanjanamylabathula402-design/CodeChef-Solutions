# ZCUWOB28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - For Loop with Break

In this example, we demonstrate how to use a for loop with a break statement to find the first multiple of 7 within a given range. Once it finds the first multiple of 7, it will print the number and exit the loop immediately using `break`.

 **When executed, the code will show:** 

```
First multiple of 7 found: 14 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:40:38.669Z  

```java
class Codechef {
    public static void main(String[] args) {
        int range = 20; // Define the range limit

        // Loop through numbers from 10 to 20
        for (int i = 10; i <= range; i++) {
            
            // Check if the number is a multiple of 7
            if (i % 7 == 0) {
                System.out.println("First multiple of 7 found: " + i); // Print the first multiple
                break; // Exit the loop immediately
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB28)