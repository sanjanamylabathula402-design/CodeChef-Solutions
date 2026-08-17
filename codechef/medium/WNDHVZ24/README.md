# WNDHVZ24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Employee Performance Evaluation

A company evaluates employee performance based on their monthly sales. The system checks whether an employee's sales exceed the performance threshold. Complete the program by filling in the missing parts to ensure the correct functionality.

 **Input:** 
Take employeeSales and performanceThreshold as input

### Sample 1:
Input
Output

```
120
100
```

```
Performance Status: Exceeds Expectations.  
Evaluation completed.  
```

### Sample 2:
Input
Output

```
100
120
```

```
Performance Status: Below Expectations.
Evaluation completed. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:41:03.359Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int employeeSales = sc.nextInt();
        int performanceThreshold = sc.nextInt();

        // Checking if employee sales exceed the performance threshold
        if (employeeSales > performanceThreshold) {  // Fill in the blank
            System.out.println("Performance Status: Exceeds Expectations."); // Fill in the blank
        } else {
            System.out.println("Performance Status: Below Expectations."); // Fill in the blank
        }

        // Indicating that the evaluation process is complete
        System.out.println("Evaluation completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ24)