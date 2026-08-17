# RESUFF08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Weather Advice Generator

In this example, we demonstrate how to use an `if-else if` statement to determine appropriate weather advice based on a predefined temperature value. This method helps in understanding conditional execution in Java.

 **When executed, the code will show:** 

```
Enjoy the pleasant weather

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:01:53.635Z  

```java
class Codechef {
    public static void main(String[] args) {
        double temperature = 25.5; // Predefined temperature value
        
        // Check if the temperature is greater than 30
        if (temperature > 30) {
            System.out.println("Stay hydrated and seek shade"); // Print a message for hot weather
        } 
        // Check if the temperature is between 20 and 30 (inclusive of 20)
        else if (temperature >= 20) {
            System.out.println("Enjoy the pleasant weather"); // Print a message for comfortable weather
        } 
        // Check if the temperature is between 10 and 20 (inclusive of 10)
        else if (temperature >= 10) {
            System.out.println("Bring a light jacket"); // Print a message for slightly cold weather
        } 
        // If the temperature is less than 10
        else {
            System.out.println("Wear warm clothes"); // Print a message for cold weather
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF08)