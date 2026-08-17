# CTMNMF38

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - While Loop with Break

In this example, we demonstrate how to use a  **while loop with a break statement**  to find the first  **multiple of 3**  within a given range. Once it finds the first multiple of 3, it will print the number and exit the loop immediately using `break`.

 **When executed, the code will show:** 

```
First multiple of 3 found: 12

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:23:33.936Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/CTMNMF38)