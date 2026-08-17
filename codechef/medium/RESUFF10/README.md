# RESUFF10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Time of Day Greeter

Write a program that takes the hour of the day as input and prints an appropriate greeting. The program should use an `if-else if` structure to determine the correct greeting based on the given hour.

 **Input:** 
A single integer representing the hour of the day (`0 to 23`).

 **Condition:** 

- If the hour is between 5 and 11, print: "Good morning!"
- If the hour is between 12 and 17, print: "Good afternoon!"
- If the hour is between 18 and 21, print: "Good evening!"
- If the hour is between 22 and 23, print: "Good night!"
- If the input is outside the range 0-23, print: "Invalid hour entered"

Run the code, enter different hours, and observe the greetings!

### Sample 1:
Input
Output

```
10
```

```
Good morning!
```

### Sample 2:
Input
Output

```
15
```

```
Good afternoon!
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:02:29.649Z  

```java
import java.util.Scanner; // Import the Scanner class to read input from the user

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for taking user input

        // Prompt the user to enter the hour of the day (0 to 23)
        int hour = scanner.nextInt(); // Read the input value as an integer
        
        // Check if the hour is between 5 and 11 inclusive (morning time)
        if (hour >= 5 && hour <= 11) {
            System.out.println("Good morning!"); // Print morning greeting
        } 
        // Check if the hour is between 12 and 17 inclusive (afternoon time)
        else if (hour >= 12 && hour <= 17) {
            System.out.println("Good afternoon!"); // Print afternoon greeting
        } 
        // Check if the hour is between 18 and 21 inclusive (evening time)
        else if (hour >= 18 && hour <= 21) {
            System.out.println("Good evening!"); // Print evening greeting
        } 
        // Check if the hour is between 22 and 23 inclusive (night time)
        else if ((hour >= 22 && hour <= 23)) {
            System.out.println("Good night!"); // Print night greeting
        } 
        // If the entered hour is invalid (not between 0 and 23)
        else {
            System.out.println("Invalid hour entered"); // Print error message
        }

        scanner.close(); // Close the Scanner object to prevent resource leaks
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF10)