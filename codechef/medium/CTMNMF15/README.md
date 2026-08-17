# CTMNMF15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Water Tank Level Monitoring System

A building's water tank needs to be monitored to ensure it doesn’t run empty.
The system should start with a user-defined water level (in liters) and decrease it by  **1 liter per cycle**  as water is used.
The system should stop when the water level reaches  **10 liters**, prompting a  **refill alert**.

 **Steps to Complete:** 

- Ask the user to input the initial water level (in liters).
- Store the input in a double variable called waterLevel.
- Use a while loop to reduce the water level by 1 liter in each iteration.
- When the water level reaches 10 liters, stop the loop and display a warning message asking to refill the tank.
### Sample 1:
Input
Output

```
15
```

```
Water level: 15.0 liters.
Water level: 14.0 liters.
Water level: 13.0 liters.
Water level: 12.0 liters.
Water level: 11.0 liters.
Warning! Water level is low (10 liters). Please refill the tank!
```

### Sample 2:
Input
Output

```
10
```

```
Warning! Water level is low (10 liters). Please refill the tank!
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:21:19.804Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        
        // Ask the user to enter the initial water level
        // Read the user input as a double value
        double waterLevel = scanner.nextDouble(); 
        
        // Start while loop to decrease water level
        while (waterLevel > 10) {  
            
            System.out.println("Current water level: " + waterLevel + " liters."); // Display remaining water
            
            // Reduce water level by 10 liters in each iteration
            waterLevel--; 
        }

        // Alert user when only 10 liters remain
        System.out.println("Warning! Water level is low (10 liters). Please refill the tank!");
        
        scanner.close(); // Close the Scanner
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF15)