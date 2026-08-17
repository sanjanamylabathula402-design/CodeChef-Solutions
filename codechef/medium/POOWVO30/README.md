# POOWVO30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:34:30.501Z  

```java
class Codechef {
    public static void main(String[] args) {
        int num = 1; // First term  
        int difference = 3; // Common difference  
        int count = 1; // Counter for terms  

        while (count <= 10) { // Loop for 10 terms  
            System.out.print(num + " "); // Print the current term  
            num += difference; // Update the term by adding the common difference  
            count++; // Increment counter  
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO30)