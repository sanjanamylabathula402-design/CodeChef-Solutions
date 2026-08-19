# PWTIEX03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create a Book Class

In this example, we have demonstrated how to define a  **class**  using a real-world object: a  **Book**.

 **Think of a Book in Real Life**, Every book has:

- Title
- Author
- Number of pages
- And maybe a function like reading the book

We can model this in code using a class.

 **Don’t worry about how it prints `You are reading the book!` — we’ll discuss it step by step.**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:38:23.293Z  

```java
class Book {
    String title;
    String author;
    int pages;

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + pages);
    }
}

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.title = "Java Programming";
        myBook.author = "John Doe";
        myBook.pages = 300;
        
        myBook.displayInfo();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX03)