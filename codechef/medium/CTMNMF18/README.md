# CTMNMF18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Sum of Every Third Number

In this example, we calculates the sum of every third number starting from  **1**  up to a user-provided  **maximum number**. It adds numbers like  **1, 4, 7, 10, etc.**  until the limit is reached.

 **Output:** 

```
The sum of every third number up to 20 is: 70

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:21:34.581Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define the maximum number limit for the calculation
        int maxNumber = 20; 

        // Initialize sum to store the total sum of numbers
        int sum = 0; 

        // Start from 1 as the first number in the sequence
        int currentNumber = 1;  

        // While loop to iterate as long as currentNumber is less than or equal to maxNumber
        while (currentNumber <= maxNumber) {
            // Add the current number to the sum
            sum += currentNumber;  

            // Move to the next third number by incrementing by 3
            currentNumber += 3;    
        }

        // Print the final sum of every third number up to the given maxNumber
        System.out.println("The sum of every third number up to " + maxNumber + " is: " + sum);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF18)