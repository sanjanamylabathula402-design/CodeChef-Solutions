# ZCUWOB29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Finding the First Number Greater Than 50

Numbers play a crucial role in various calculations. Your task is to complete the Java program that identifies the  **first number greater than 50**  using a  **for loop**  and exits the loop once the condition is met using `break`.

 **Expected Output:** 

```
First number greater than 50 found: 53  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:41:02.430Z  

```java
class Codechef {
    public static void main(String[] args) {
        int range = 100; // Upper limit of the range

        // Loop through numbers from 1 to range
        for (int i = 1; i <= range; i+=4) {
            
            // Check if the number is greater than 50
            if (i > 50) { 
                System.out.println("First number greater than 50 found: " + i); // Print the number
                break; // Exit the loop immediately
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB29)