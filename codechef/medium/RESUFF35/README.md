# RESUFF35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Menu Selection in a Restaurant

Write a Program to Select a Dish from the Menu. This program displays a restaurant menu and takes the user’s choice as input. Based on the selected option, it uses a `switch` statement to determine the corresponding dish and displays the result.

 **Menu Options:** 

- Pasta
- Burger
- Salad
- Dessert

The user is expected to input a number from `1` to `4`. If the input is invalid, the program will display an appropriate message.

 **Input:** 
A single integer representing the menu item number selected by the user.

Run the code and enter different values from the menu to see how the switch statement works!

### Sample 1:
Input
Output

```
2
```

```
Welcome to the Restaurant! Please select a dish:
1. Pasta
2. Burger
3. Salad
4. Dessert
You selected: Burger

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:08:04.476Z  

```java
import java.util.Scanner; // Import Scanner class for user input

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Display menu options
        System.out.println("Welcome to the Restaurant! Please select a dish:");
        System.out.println("1. Pasta");
        System.out.println("2. Burger");
        System.out.println("3. Salad");
        System.out.println("4. Dessert");

        // Read user input for menu choice
        int choice = scanner.nextInt();

        String dish; // Variable to store the selected dish

        // Determine the dish based on the menu selection using switch statement
        switch (choice) {
            case 1: // If user selects "1"
                dish = "Pasta";
                break;

            case 2: // If user selects "2"
                dish = "Burger";
                break;

            case 3: // If user selects "3"
                dish = "Salad";
                break;

            case 4: // If user selects "4"
                dish = "Dessert";
                break;

            default: // If the user enters an invalid option
                dish = "Invalid choice. Please select a valid menu option.";
                break;
        }

        // Output the selected dish or error message
        System.out.println("You selected: " + dish);

        scanner.close(); // Close the Scanner object
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF35)