# RESUFF15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Shipping Charges Calculation

Write a program that takes package weight and delivery speed as input to determine the shipping charge. The program should use a  **nested if statement**  to check whether the package weight is within the allowed limit and apply charges based on the delivery speed.

 **Input:** 

- A double representing the package weight.
- A string representing the delivery speed ("Standard" or "Express").

 **Condition:** 

- If the weight is 5 kg or less: If the delivery speed is "Express", print: "Shipping charge: $15" Otherwise (for "Standard" delivery), print: "Shipping charge: $10"
- If the weight exceeds 5 kg, print: "Shipping not available for packages above 5 kg."

Run the code, enter different weights and delivery speeds, and check the shipping charges!

### Sample 1:
Input
Output

```
4.5
Express
```

```
Shipping charge: $15

```

### Sample 2:
Input
Output

```
3.2
Standard
```

```
Shipping charge: $10
```

### Sample 3:
Input
Output

```
6.0
Express
```

```
Shipping not available for packages above 5 kg.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:03:43.278Z  

```java
import java.util.Scanner; // Import the Scanner class to take user input

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the weight of the package
        // Read the weight input from the user
        double weight = scanner.nextDouble(); 
        
        // Consume the leftover newline character
        scanner.nextLine(); 
        // Read the delivery speed input from the user
        String deliverySpeed = scanner.nextLine(); 

        // Check if the weight of the package is within the allowed limit
        if (weight <= 5) {
            // Check if the delivery speed is "Express"
            if (deliverySpeed.equalsIgnoreCase("Express")) {
                System.out.println("Shipping charge: $15"); // Print the charge for Express delivery
            } else { 
                // If the delivery speed is "Standard"
                System.out.println("Shipping charge: $10"); // Print the charge for Standard delivery
            }
        } else { 
            // If the weight exceeds the allowed limit
            System.out.println("Shipping not available for packages above 5 kg."); // Print an error message
        }

        scanner.close(); // Close the Scanner object to prevent resource leaks
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF15)