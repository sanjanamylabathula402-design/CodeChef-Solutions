# POOWVO20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Generating Addition Tables for Odd Numbers

In this task, you are asked to generate  **addition tables for odd numbers**  within a  **user-defined range**. Each addition table should display the  **sum of the odd number**  with the multipliers from given range.

 **Input:**  Take the starting point, ending point, and addition limit as input.

 **Steps to Complete:** 

- A while loop iterates through numbers from start to end and it checks for odd numbers using start % 2 != 0.
- For each odd number, an inner while loop generates its addition table up to the given limit.
- Print the result.
### Sample 1:
Input
Output

```
1
5
5
```

```
Addition Table for 1:
1 + 1 = 2
1 + 2 = 3
1 + 3 = 4
1 + 4 = 5
1 + 5 = 6
Addition Table for 3:
3 + 1 = 4
3 + 2 = 5
3 + 3 = 6
3 + 4 = 7
3 + 5 = 8
Addition Table for 5:
5 + 1 = 6
5 + 2 = 7
5 + 3 = 8
5 + 4 = 9
5 + 5 = 10
```

### Sample 2:
Input
Output

```
1
7
2
```

```
Addition Table for 1:
1 + 1 = 2
1 + 2 = 3
Addition Table for 3:
3 + 1 = 4
3 + 2 = 5
Addition Table for 5:
5 + 1 = 6
5 + 2 = 7
Addition Table for 7:
7 + 1 = 8
7 + 2 = 9
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:31:00.687Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();  
        int end = scanner.nextInt();  
        int limit = scanner.nextInt(); 
        while (start <= end) {
            if (start % 2 != 0) { 
                System.out.println("Addition Table for " + start + ":");
                int addend = 1;
                while (addend <= limit) {
                    System.out.println(start + " + " + addend + " = " + (start + addend));
                    addend++; 
                }
            }
            start++; 
        }
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO20)