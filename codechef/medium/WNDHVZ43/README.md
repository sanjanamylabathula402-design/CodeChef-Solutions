# WNDHVZ43

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Online Exam Eligibility

In this example, we demonstrate how to use an if-else statement with the logical && operator to check if a student is eligible to take an online exam. This method helps in understanding multiple conditions using and in Java.

 **When executed, the code will show:** 

```
You are eligible to take the exam.  
Eligibility check completed.  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:59:10.775Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Variables representing eligibility conditions
        boolean hasRegistered = true;
        int attendancePercentage = 80;
        int requiredAttendance = 75;

        // Check if student is registered and meets attendance requirement
        if (hasRegistered && (attendancePercentage >= requiredAttendance)) {
            System.out.println("You are eligible to take the exam.");
        } else {
            System.out.println("You are not eligible to take the exam.");
        }

        System.out.println("Eligibility check completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ43)