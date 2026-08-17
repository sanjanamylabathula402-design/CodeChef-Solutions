# ZWFPSZ09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Weather Info

A weather monitoring system collects  **temperature, humidity, and rain prediction**  from user input. Complete the program by filling in the missing parts to ensure it correctly retrieves and displays the weather details.

 **Input:** 

- A float representing the temperature.
- A double representing the humidity percentage.
- A boolean representing whether rain is expected.

Run the code, modify values, and verify that it correctly captures different weather conditions!

### Sample 1:
Input
Output

```
28.5  
72.3  
false 
```

```
Weather Information:
Temperature: 28.5°C
Humidity: 72.3%
Rain Expected: false

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:05:53.672Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Collect the temperature as a float
        float temperature = scanner.nextFloat(); // Input temperature (float)

        // Collect the humidity percentage as a double
        double humidity = scanner.nextDouble(); // Input humidity (double)

        // Collect the rain prediction as a boolean
        boolean willRain = scanner.nextBoolean(); // Input rain prediction (boolean)

        // Display the collected weather details
        System.out.println("Weather Information:");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Rain Expected: " + willRain);

        // Close the Scanner object
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ09)