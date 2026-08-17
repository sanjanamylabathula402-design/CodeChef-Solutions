# WNDHVZ20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Apple Distribution Check

Write a program that takes the number of apples as input and determines whether they can be evenly divided among a group of friends. If the number of apples is evenly divisible by 4, they can be shared equally; otherwise, some apples will be left over.

 **Input:** 
A single integer representing the number of apples.

### Sample 1:
Input
Output

```
12

```

```
The apples can be evenly shared among friends!

```

### Sample 2:
Input
Output

```
15

```

```
Some apples will be left over after sharing!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:40:36.865Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // user to enter the number of apples
        int apples = scanner.nextInt();

        // Check if apples can be evenly divided by 4
        if (apples % 4 == 0) {
            System.out.println("The apples can be evenly shared among friends!");
        } else {
            System.out.println("Some apples will be left over after sharing!");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ20)