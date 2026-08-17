# ZCUWOB30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find first number divisible by 7 and 14

Write a Java program that takes  **user input**  for a start value, end value, and step size.
The program ensures that the start value is  **less than**  the end value and then finds the  **first number in the range that is divisible by both 7 and 14**  using a  **for loop with a break statement**.

### Sample 1:
Input
Output

```
1001
10000
3
```

```
1022
```

### Sample 2:
Input
Output

```
100
150
4
```

```
112
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:41:18.639Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();
        
        // Validate that start is less than end
        while (start >= end) {
            System.out.println("Invalid input! Start value must be less than end value.");
        }

        // Loop starting from 1001, incrementing by 3 each time
        for (int i = start; i <= end; i += step) {  
            
            // Check if the number is divisible by both 7 and 14
            if (i % 7 == 0 && i % 14 == 0) {  
                System.out.println(i);  
                break; // Exit the loop immediately after finding the number
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB30)