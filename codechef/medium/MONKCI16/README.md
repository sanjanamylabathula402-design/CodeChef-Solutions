# MONKCI16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:28:55.100Z  

```java
import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of fruits in the basket
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 2: Store basket fruits in ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fruits.add(sc.nextLine());
        }

        // Step 3: Take number of favorite fruits to check
        int m = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 4: Check each favorite fruit
        for (int i = 0; i < m; i++) {
            String favFruit = sc.nextLine();
            System.out.println(fruits.contains(favFruit));
        }

        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI16)