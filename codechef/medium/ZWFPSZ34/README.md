# ZWFPSZ34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Travel Booking Information

A travel booking system collects details from users, such as  **name, number of travelers, ticket price, luggage weight, and meal preference**. Complete the program by filling in the missing parts to ensure it correctly captures and displays travel booking details.

 **Input:** 

- A String representing the traveler's name.
- An int representing the number of travelers.
- A double representing the ticket price per traveler.
- A float representing the total luggage weight in kilograms.
- A boolean representing whether meals are included.

Run the code, enter different booking details, and verify that it correctly captures the travel information!

### Sample 1:
Input
Output

```
Alice Johnson  
3  
250.50  
15.8  
true 
```

```
Booking Information:
Name: Alice Johnson
Number of Travelers: 3
Ticket Price per Traveler: $250.5
Luggage Weight: 15.8 kg
Meals Included: true
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:29:26.833Z  

```java
import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Collect the traveler's name
        String name = scanner.nextLine(); // Traveler's name (String)

        // Collect the number of travelers
        int numTravelers = scanner.nextInt(); // Number of travelers (int)

        // Collect the ticket price per traveler
        double ticketPrice = scanner.nextDouble(); // Ticket price (double)

        // Collect the total luggage weight in kilograms
        float luggageWeight = scanner.nextFloat(); // Luggage weight (float)

        // Collect meal preference as a boolean (true/false)
        boolean includeMeals = scanner.nextBoolean(); // Meal preference (boolean)

        // Display the travel booking details
        System.out.println("Booking Information:");
        System.out.println("Name: " + name); // Display traveler's name
        System.out.println("Number of Travelers: " + numTravelers); // Display the number of travelers
        System.out.println("Ticket Price per Traveler: $" + ticketPrice); // Display ticket price per traveler
        System.out.println("Luggage Weight: " + luggageWeight + " kg"); // Display luggage weight
        System.out.println("Meals Included: " + includeMeals); // Display meal inclusion status

        // Close the Scanner object to release system resources
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ34)