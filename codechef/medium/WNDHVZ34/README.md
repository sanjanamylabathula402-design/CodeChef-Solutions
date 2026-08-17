# WNDHVZ34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Verifying Scholarship Eligibility

A university grants scholarships to students who achieve a minimum qualifying score in their entrance exam. The system checks whether the student's score meets or exceeds the required passing score. Complete the program by filling in the missing parts to ensure correct functionality.

 **Input:** 
Take input of studentScore and passingScore.

### Sample 1:
Input
Output

```
85
80
```

```
Scholarship Granted!
Evaluation completed.
```

### Sample 2:
Input
Output

```
80
80
```

```
Scholarship Granted!
Evaluation completed.
```

### Sample 3:
Input
Output

```
75
80
```

```
Scholarship Denied!
Evaluation completed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:57:43.534Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Taking input of studentScore and passingScore
        
        Scanner sc = new Scanner(System.in);
        int studentScore=sc.nextInt();
        int passingScore=sc.nextInt();
        
        // Checking if the student meets the scholarship criteria
        if (studentScore >= passingScore) {  // Fill in the blank
            System.out.println("Scholarship Granted!"); // Fill in the blank
        } else {
            System.out.println("Scholarship Denied!"); // Fill in the blank
        }

        // Indicating that the evaluation process is complete
        System.out.println("Evaluation completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ34)