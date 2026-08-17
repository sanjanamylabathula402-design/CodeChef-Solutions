# CTMNMF25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Descending a Mountain Trail

In this Question, A hiker is tracking their descent down a mountain trail, recording the elevation at regular intervals. The system should start with a user-defined elevation (in meters) and decrease it by 50 meters per cycle as the hiker descends. The system should stop when the elevation reaches 100 meters or less, indicating the end of the trail.

 **Steps to Complete:** 

- Ask the user to input the initial elevation (in meters).
- Store the input in an integer variable currentElevation.
- Use a while loop to reduce the elevation by 50 meters in each iteration.
- When the elevation reaches 100 meters or less, display a message indicating the end of the trail.
### Sample 1:
Input
Output

```
150
```

```
Current elevation: 150 meters.
End of the trail reached at 100 meters.
```

### Sample 2:
Input
Output

```
300

```

```
Current elevation: 300 meters.
Current elevation: 250 meters.
Current elevation: 200 meters.
Current elevation: 150 meters.
End of the trail reached at 100 meters.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:22:25.572Z  

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

[View on CodeChef](https://www.codechef.com/problems/CTMNMF25)