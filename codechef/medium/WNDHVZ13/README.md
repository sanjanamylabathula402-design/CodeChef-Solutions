# WNDHVZ13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Checking Employee ID

In this example, we demonstrate how to use an `if-else` statement with the equality operator `==` to verify whether an employee's ID matches the assigned office ID. This method helps in understanding how comparisons work in Java.

 **When executed, the code will show:** 

```
Access granted: Welcome, Employee 1024.  
ID verification completed.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:33:03.706Z  

```java
import java.util.*;
// Main class
class Codechef {
    public static void main(String[] args) {
        // Declaring an integer variable to store the employee ID
        int employeeID = 1024;

        // Checking if the employee ID matches the assigned office ID
        if (employeeID == 1024) {
            // Executes if the condition is true
            System.out.println("Access granted: Welcome, Employee 1024.");
        } else {
            // Executes if the condition is false
            System.out.println("Access denied: Invalid Employee ID.");
        }

        // This statement executes regardless of the condition
        System.out.println("ID verification completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ13)