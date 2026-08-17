# CTMNMF44

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Electricity Bill Processing

What will be the output of the below code?

```
class Codechef {
    public static void main(String[] args) {
        int unit = 1;

        while (unit <= 10) {
            unit++;
            
            if(unit>10)
            {
                break;
            }
            
            if (unit % 2 == 0) {
                continue;
            }

            if (unit == 9) {
                System.out.println("High consumption alert at unit: " + unit);
            } else {
                System.out.println("Processing unit: " + unit);
            }
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:24:41.502Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int i = 1; // Initialize counter

        while (i <= 10) { // Loop from 1 to 10
            if (i % 2 == 0) { // Skip multiples of 2
                i++; // Move to the next number
                continue; // Skip this iteration
            }
            System.out.println(i); // Print odd numbers
            i++; // Increment counter
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF44)