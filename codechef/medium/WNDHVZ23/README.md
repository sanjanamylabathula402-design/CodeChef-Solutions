# WNDHVZ23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Exam Eligibility Check

In this example, we demonstrate how to use an  **if-else**  statement to determine whether a student is eligible to take a final exam based on their attendance percentage. This method helps in understanding conditional execution in Java.

 **When executed, the code will show:** 

```
You are eligible to take the exam.  
Attendance check completed.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:40:51.482Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Define the attendance percentage
        int attendancePercentage = 78;

        // Check if the student is eligible for the exam
        if (attendancePercentage > 75) {
            System.out.println("You are eligible to take the exam.");
        } else {
            System.out.println("You are not eligible to take the exam.");
        }

        // Print completion message
        System.out.println("Attendance check completed.");
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ23)