# WNDHVZ33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Exam Passing Criteria

In this example, we demonstrate how to use an if-else statement to check whether a student has passed an exam based on their score. This method helps understand conditional execution in Java.

 **When executed, the code will show:** 

```
Congratulations! You passed the exam.  
Result check completed.  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:57:30.453Z  

```java
import java.util.*;
// Program to check if a student has passed the exam
class Codechef {
    public static void main(String[] args) {
        int score = 75; // Student's score
        int passingScore = 50; // Minimum score required to pass

        // Check if the student's score is greater than or equal to the passing score
        if (score >= passingScore) {
            System.out.println("Congratulations! You passed the exam.");
        } else {
            System.out.println("You did not pass. Better luck next time!");
        }

        System.out.println("Result check completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ33)