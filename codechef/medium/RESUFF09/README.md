# RESUFF09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Discount Calculation

A store offers discounts based on the total purchase amount. The conditions are as follows:

- If the total amount is ₹5000 or more, a 20% discount is applied.
- If the total amount is between ₹3000 and ₹4999, a 10% discount is applied.
- If the total amount is between ₹1000 and ₹2999, a 5% discount is applied.
- Otherwise, no discount is given.

Which of the following  **correctly fills the missing condition**  in the if-else if block?

```
class Codechef {
    public static void main(String[] args) {
int amount = 3200;
if (amount >= 5000) {
    System.out.println("Discount: 20%");
} else if (_____) {  // Fill in the blank
    System.out.println("Discount: 10%");
} else if (amount >= 1000) {
    System.out.println("Discount: 5%");
} else {
    System.out.println("No discount");
}
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:02:09.767Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/RESUFF09)