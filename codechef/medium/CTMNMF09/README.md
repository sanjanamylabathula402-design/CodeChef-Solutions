# CTMNMF09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Counting Down for a Rocket Launch

A space agency is conducting a countdown for a rocket launch. The loop runs using a forward loop counter with a while loop and prints each number.

```
class Codechef {
    public static void main(String[] args) {
        int count = 1; 

        while (count <= 10) {  
            System.out.println("T-minus " + count);  
            count++; 
        }

        System.out.println("Lift-off!");  
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:20:10.871Z  

```cpp
import java.util.Scanner;  // Import Scanner for user input  

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object  
        
        // Prompt the user to enter the number for which the table is generated  
        // Read the user's input directly and use it in the while loop
        int number = scanner.nextInt();  // Read user input using the scanner object

        int multiplier = 1;  // Initialize counter  

        // Loop will run until multiplier becomes equal to 10
        while (multiplier <= 10) {  
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));  
            multiplier++;  // Increment counter  
        }
        
        scanner.close();  // Close the scanner  
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF09)