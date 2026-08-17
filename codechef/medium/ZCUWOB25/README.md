# ZCUWOB25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Generating a Number Pattern with Conditions

Write a program that prints a  **number pattern**  where even numbers are replaced with `"EVEN"`, while odd numbers are printed as they are.
The program will take  **user input for rows and columns**, then use  **nested for loops**  to iterate through rows and columns and apply an  **if-else condition**  to determine the output.
Print the output.

 **Note:**  Start the number pattern assuming the 1st number is 0.
Hence in the 1st row, 1st column - the entry is 0 which will be considered 'EVEN'.
In the 2nd row, 1st column - the 1st entry is 1 followed by 2 which will be considered 'EVEN'.

Check the sample output given below for further clarity.

### Sample 1:
Input
Output

```
4
4
```

```
EVEN  1   EVEN  3   
1   EVEN  3   EVEN  
EVEN  3   EVEN  5   
3   EVEN  5   EVEN 
```

### Sample 2:
Input
Output

```
3
5
```

```
EVEN  1   EVEN  3   EVEN  
1   EVEN  3   EVEN  5   
EVEN  3   EVEN  5   EVEN 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:40:21.862Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                int num = i + j; 
                if (num % 2 == 0) {
                    System.out.print("EVEN  ");
                } else {
                    System.out.print(num + "   ");
                }
            }
            System.out.println(); 
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB25)