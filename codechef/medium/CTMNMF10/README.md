# CTMNMF10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Digits Calculator

A banking application ensures data integrity by verifying the sum of digits in an account number. This helps in detecting data entry errors when customers register their account details. The system extracts and sums all digits in the account number and verifies it against the expected digit sum.

 **Steps to Complete:** 

- Read an integer from the user.
- Initialize a sum variable to store the total sum of digits.
- Use a while loop to extract each digit using the modulus operator (%).
- Add the extracted digit to the sum.
- Print the final sum of the digits until number!=0.
### Sample 1:
Input
Output

```
456
```

```
Sum of digits: 15
```

### Sample 2:
Input
Output

```
1023
```

```
Sum of digits: 6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:20:27.513Z  

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

[View on CodeChef](https://www.codechef.com/problems/CTMNMF10)