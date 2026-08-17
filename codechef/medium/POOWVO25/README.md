# POOWVO25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Make your first triangle!

Write a program to create a  **left-aligned number triangle pattern**  using  **while loops**, where the user inputs the number of `rows` (denoted as `n`).

 **Steps to Complete:** 

- Take user input n and validate it to ensure it's a positive integer.
- Use a nested while loop, where: The outer loop controls the number of rows from 1 to n. The inner loop prints numbers starting from 1 up to the current row number.
- Print a new line after each row to move to the next.
- Display the final pattern.
### Sample 1:
Input
Output

```
6
```

```
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
```

### Sample 2:
Input
Output

```
5
```

```
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
```

### Sample 3:
Input
Output

```
-1
```

```
Error: Please enter a positive integer.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:31:38.618Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input and validate
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Step 2: Generate the pattern using while loops
        int row = 1;
        while (row <= n) {
            int num = 1;
            while (num <= row) {
                System.out.print(num + " ");
                num++;
            }

            // Step 3: Move to the next line
            System.out.println();
            row++;
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO25)