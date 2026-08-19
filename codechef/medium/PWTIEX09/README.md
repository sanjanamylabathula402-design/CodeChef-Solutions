# PWTIEX09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create a Book Library System

In this practice problem, you will create a Book Library System where we define a Book class with attributes like title and author. Finally, you will display all the books in the library.

### Expected output

```
Title: King Lear, Author: William Shakespeare

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:39:17.731Z  

```java
class Book {
    String title;
    String author;

    // Method to display book information
    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    public static void main(String[] args) {
        
        // Create a Book object and assign title and author
        Book book1 = new Book();  // Create a new Book object
        book1.title = "King Lear";  // Assign the title
        book1.author = "William Shakespeare";  // Assign the author
        
        // Call the displayInfo function to print book details
        book1.displayInfo();  // Output: Title: King Lear, Author: William Shakespeare
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX09)