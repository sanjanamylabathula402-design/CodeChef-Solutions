# MONKCI21

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:29:34.104Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Create an empty ArrayList called bookshelf
        ArrayList<String> bookshelf = new ArrayList<>();
        
        // Check if bookshelf is empty and print appropriate message
        if (bookshelf.isEmpty()) {
            System.out.println("Bookshelf is empty");
        } else {
            System.out.println("Bookshelf has books");
        }

        // Add "Harry Potter" to the bookshelf
        bookshelf.add("Harry Potter");

        // Check if bookshelf is empty again and print appropriate message
        if (bookshelf.isEmpty()) {
            System.out.println("Bookshelf is empty");
        } else {
            System.out.println("Bookshelf has books");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI21)