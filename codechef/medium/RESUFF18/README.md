# RESUFF18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Checking Voting Eligibility

In this example, we demonstrate how to use the  **ternary operator (`? :`)**  to check if a person is eligible to vote based on their age. This method helps in understanding  **conditional execution in Java**  using a compact syntax.

 **When executed, the code will show:** 

```
Eligible to vote

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:04:00.857Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Initialize the variable 'age' with a predefined value (20)
        int age = 20; 

        // Use the conditional (ternary) operator to check voting eligibility
        // If 'age' is 18 or more, the result is "Eligible to vote"
        // Otherwise, the result is "Not eligible to vote"
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

        // Output the eligibility result to the console
        System.out.println(eligibility);
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF18)