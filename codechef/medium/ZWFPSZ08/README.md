# ZWFPSZ08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### News letter Subscription

In this example, we demonstrate how to take user input for subscription status, store it in a `boolean` variable, and display the result. Using a `boolean` variable allows us to handle `true/false` values, making it ideal for representing user choices like subscription preferences.

When executed, the program will display whether the user is subscribed or not based on the input.

### Sample 1:
Input
Output

```
true
```

```
Subscription Status:
Subscribed: true
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T08:47:54.731Z  

```java
import java.util.Scanner; // Import Scanner for user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the input as a boolean and store it
        boolean isSubscribed = scanner.nextBoolean(); // Input: true or false

        // Display subscription status
        System.out.println("\nSubscription Status:");
        System.out.println("Subscribed: " + isSubscribed);

        // Close the Scanner object
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ08)