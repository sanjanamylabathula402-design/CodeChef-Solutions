# RESUFF34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Weather Condition Clothing Recommender

A  **weather forecasting system**  checks the current weather based on a given  **weather code**. The system determines the type of weather and provides advice accordingly. Complete the program by filling in the missing parts to ensure the correct functionality.

### Sample 1:
Input
Output

```
1
```

```
It's sunny! Wear light clothes and don't forget sunscreen.
```

### Sample 2:
Input
Output

```
2
```

```
It's rainy! Bring an umbrella and wear waterproof clothes.
```

### Sample 3:
Input
Output

```
3
```

```
It's snowy! Wear warm layers and snow boots.
```

### Sample 4:
Input
Output

```
4
```

```
It's windy! Wear a windbreaker and avoid loose clothing.
```

### Sample 5:
Input
Output

```
5
```

```
Invalid weather condition code. Please enter 1, 2, 3, or 4.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:07:47.600Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int weatherCode = scanner.nextInt(); //User Input 

        // Switch statement to determine the weather condition
        switch (weatherCode) {
            case 1: // Case for Sunny
                System.out.println("It's sunny! Wear light clothes and don't forget sunscreen.");
                break; // Exit the switch statement after executing this case

            case 2: 
                System.out.println("It's rainy! Bring an umbrella and wear waterproof clothes.");
                break;

            case 3: 
                System.out.println("It's snowy! Wear warm layers and snow boots.");
                break; 

            case 4: 
                System.out.println("It's windy! Wear a windbreaker and avoid loose clothing.");
                break; 

            default: 
                System.out.println("Invalid weather condition code. Please enter 1, 2, 3, or 4.");
                break; 
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF34)