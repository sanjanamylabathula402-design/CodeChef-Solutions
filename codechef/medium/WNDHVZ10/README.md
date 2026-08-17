# WNDHVZ10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Exam Eligibility Checker

Write a program that takes a student's age as input and checks if they are eligible to appear for a college entrance exam. The program should use an `if-else` statement to print a message based on the given condition.

 **Input:** 
A single integer representing the student's age.

 **Condition:** 

- If the age is 17 or more, print "You are eligible to take the entrance exam."
- Otherwise, print "You are not eligible to take the entrance exam."
### Sample 1:
Input
Output

```
18

```

```
You are eligible to take the entrance exam.

```

### Sample 2:
Input
Output

```
16

```

```
You are not eligible to take the entrance exam.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:32:46.715Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for age
        int age = scanner.nextInt();

        // Checking exam eligibility
        if (age >= 17) {
            System.out.println("You are eligible to take the entrance exam.");
        } else {
            System.out.println("You are not eligible to take the entrance exam.");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ10)