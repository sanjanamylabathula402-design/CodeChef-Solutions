# ZCUWOB16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Generating a Number Sequence

Write a program to generate a number sequence using a for loop.
The user will input the  **start, end, and step values**, ensuring that the start is less than the end before proceeding.
If start is greater than or equal to end, print `"Invalid Input"`.

### Input format

Take input of start, end, and step values.

### Output format

Check sample input / output below for clarity on input and output format.

 **Steps to Complete:** 

- Use a for loop to print the sequence with the given step size.
- Display the generated sequence and print "Sequence generation complete!".
### Sample 1:
Input
Output

```
2
12
3
```

```
Generated sequence:  
2 5 8 11  
Sequence generation complete! 
```

### Sample 2:
Input
Output

```
12
2
3
```

```
Invalid Input
```

### Sample 3:
Input
Output

```
2
10
3
```

```
Generated sequence:
2 5 8 
Sequence generation complete!
```

### Sample 4:
Input
Output

```
6
6
2
```

```
Invalid Input
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:38:56.004Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input for start, end, and step values
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();

        // Step 2: Validate that start is less than end
       if (start >= end) {
            System.out.println("Invalid Input");
            
        }
        else{
            // Step 3: Use a for loop to print the sequence
            System.out.println("Generated sequence:");
            for (int i = start; i < end; i += step) {
                System.out.print(i + " ");
            }
    
            System.out.println("\nSequence generation complete!");

        }

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB16)