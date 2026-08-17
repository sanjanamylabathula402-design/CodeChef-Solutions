# POOWVO28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Generating an Arithmetic Series

In this example, we demonstrate how to generates an arithmetic series using a while loop. The series follows a fixed pattern where each term increases by a common difference, printing the first 10 terms sequentially.

 **When executed, the code will show:** 

```
1 4 7 10 13 16 19 22 25 28 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:34:29.277Z  

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

[View on CodeChef](https://www.codechef.com/problems/POOWVO28)