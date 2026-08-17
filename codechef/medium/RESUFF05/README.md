# RESUFF05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Temperature-Based Weather Advice

Write a program that takes the temperature as input and prints a weather message. The program should use an  **if-else if**  structure to determine the appropriate message based on the given temperature.

 **Input:** 
A single integer representing the temperature.

 **Condition:** 

- If the temperature is above 30, print: "It's hot outside! Stay hydrated."
- If the temperature is between 10 and 30 (inclusive), print: "The weather is moderate. Enjoy your day!"
- If the temperature is below 10, print: "It's cold outside! Wear warm clothes."
### Sample 1:
Input
Output

```
35
```

```
It's hot outside! Stay hydrated.

```

### Sample 2:
Input
Output

```
20
```

```
The weather is moderate. Enjoy your day!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:01:09.996Z  

```java
import java.util.Scanner; // Import Scanner class to take input from the user

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        
        // Read user input and store it in the 'temperature' variable
        int temperature = scanner.nextInt(); 

        // Check if the temperature is above 30
        if (temperature > 30) {
            System.out.println("It's hot outside! Stay hydrated."); // Message for hot weather
        } 
        // Use one 'else if' to check if the temperature is between 10 and 30 (inclusive)
        else if (temperature >= 10) {
            System.out.println("The weather is moderate. Enjoy your day!"); // Message for moderate weather
        } 
        // Use 'else' for all other conditions (temperature below 10)
        else {
            System.out.println("It's cold outside! Wear warm clothes."); // Message for cold weather
        }

        scanner.close(); // Close the Scanner object to free up resources
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF05)