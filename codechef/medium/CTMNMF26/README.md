# CTMNMF26

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:22:28.111Z  

```java
import java.util.Scanner;
class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the initial elevation
        int currentElevation = scanner.nextInt();

        // Loop to decrement elevation by 50 meters until reaching 100 meters or less
        while (currentElevation > 100) {
            System.out.println("Current elevation: " + currentElevation + " meters.");
            currentElevation -= 50; // Decrement the elevation by 50 meters
        }

        // Display the end of the trail message
        System.out.println("End of the trail reached at 100 meters or below.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF26)