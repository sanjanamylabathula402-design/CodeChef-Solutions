# JNQEBY14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:45:54.640Z  

```java
class Codechef {
    // Instance variables (fields) for the Codechef class
    String title;
    String author;
    int yearPublished;

    // Parameterized constructor to initialize the title, author, and yearPublished
    public Codechef(String bookTitle, String bookAuthor, int bookYearPublished) {
        // Initializing instance variables using the constructor parameters
        title = bookTitle;
        author = bookAuthor;
        yearPublished = bookYearPublished;
    }

    // Main method to test the class and constructor
    public static void main(String[] args) {
        // Create a Codechef object (Book object) using the parameterized constructor
        Codechef myBook = new Codechef("The Catcher in the Rye", "J.D. Salinger", 1951);

        // Displaying the details of the book directly inside the main method
        System.out.println("Book Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
        System.out.println("Year Published: " + myBook.yearPublished);
    }
}



```

---

[View on CodeChef](https://www.codechef.com/problems/JNQEBY14)