# CTMNMF11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:20:29.022Z  

```java
import java.util.Scanner;  

class Codechef {  
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);  
        
        // Read an integer input from the user
        int number = scanner.nextInt();  
        
        // Variable to store the sum of digits of the number  
        int sum = 0; 

        // Start a while loop, the loop will run until the number becomes 0
        while (number > 0) {  
            
            // Get the last digit of the number using the modulus operator (%)
            // Adds the last digit to the sum
            sum += number % 10;   
            
            // Remove the last digit of the number by dividing it by 10
            // This reduces the number by removing the last digit
            number /= 10; 
        }  

        // Print the result, which is the sum of the digits
        System.out.println("Sum of digits: " + sum);
    }  
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF11)