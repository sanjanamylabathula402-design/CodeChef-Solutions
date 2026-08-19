# PWTIEX04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:38:27.133Z  

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

[View on CodeChef](https://www.codechef.com/problems/PWTIEX04)