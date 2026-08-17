# CTMNMF14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fuel Monitoring System

A car's fuel level must be monitored to prevent it from running too low. Your task is to store the initial fuel amount (`in liters`) and decrement it by `1` liter at each step as the car drives, ensuring the fuel is tracked accurately.

 **Steps to Complete:** 

- Initialize a double variable fuel to represent the fuel level in liters.
- Use a while loop to decrement the fuel level by 1 liter per iteration.
- The loop should stop when the fuel level reaches 1.0 liters.
- Print a message for each reduction in fuel, and alert the driver when only 1.0 liter remains.

 **Expected Output:** 

```
Fuel remaining: 7.0 liters.
Fuel remaining: 6.0 liters.
Fuel remaining: 5.0 liters.
Fuel remaining: 4.0 liters.
Fuel remaining: 3.0 liters.
Fuel remaining: 2.0 liters.
Warning! Only 1.0 liter of fuel left. Refuel soon!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:21:01.369Z  

```java
class Codechef {
    public static void main(String[] args) {
        double fuel = 7.0; // Initial fuel level is 7 liters

        // While the fuel level is greater than 1.0, keep reducing it
        while (fuel > 1.0) {  
            System.out.println("Fuel remaining: " + fuel + " liters."); // Display remaining fuel
            fuel -= 1.0; // Reduce fuel by 1.0 liter in each iteration
        }

        // Alert the driver when only 1.0 liter of fuel remains
        System.out.println("Warning! Only 1.0 liter of fuel left. Refuel soon!");  
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF14)