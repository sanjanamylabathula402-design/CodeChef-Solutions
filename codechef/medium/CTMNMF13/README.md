# CTMNMF13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Countdown Timer for Baking

In this example, we demonstrate how to use a backward counter loop with a `while` loop to simulate a countdown timer for baking. The timer starts at a predefined baking time and counts down until the time is up.

 **When executed, the code will show:** 

```
Time left: 4 minutes
Time left: 3 minutes
Time left: 2 minutes
Time left: 1 minutes
Baking complete! Enjoy your cookies!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:20:48.354Z  

```java
class Codechef {
    public static void main(String[] args) {
        int bakingTime = 4; // Initialize baking time in minutes

        // Use a while loop to count down from 4 to 0
        while (bakingTime > 0) {  // The loop runs as long as bakingTime is greater than 0
        
            System.out.println("Time left: " + bakingTime + " minutes"); // Display remaining time
            
            bakingTime--;  // Decrease the time by 1 minute in each iteration
        }

        // Once the loop ends, display a message indicating baking is complete
        System.out.println("Baking complete! Enjoy your cookies!");  
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF13)