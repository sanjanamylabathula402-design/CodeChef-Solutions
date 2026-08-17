# WNDHVZ05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Discount Eligibility Checker

Write a program that takes the total purchase amount as input and checks if the customer is eligible for a discount.
The program should use an if statement to print a message only if the purchase amount is 1000 or more; otherwise, nothing should be printed.

 **Input:** 
A single integer representing the total purchase amount.

### Sample 1:
Input
Output

```
1200
```

```
Congratulations! You are eligible for a discount.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:32:03.221Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for purchase amount
        int purchaseAmount = scanner.nextInt();

        // Checking discount eligibility
        if (purchaseAmount >= 1000) {
            System.out.println("Congratulations! You are eligible for a discount.");
        }

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ05)