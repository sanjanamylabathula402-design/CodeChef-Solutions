# WNDHVZ25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Advanced Course Eligibility Check

Write a program that takes the student's score as input and determines whether they are eligible for an advanced course. If the score is greater than 60, the student qualifies; otherwise, they need to improve their score.

 **Input:** 
A single integer representing the student's score (out of 100).

### Sample 1:
Input
Output

```
75

```

```
You are eligible for the advanced course!

```

### Sample 2:
Input
Output

```
60

```

```
You need to score higher to enroll in the advanced course.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:52:23.317Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the student's score
        int score = scanner.nextInt();

        // Checking eligibility for the advanced course
        if (score > 60) {
            System.out.println("You are eligible for the advanced course!");
        } else {
            System.out.println("You need to score higher to enroll in the advanced course.");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ25)