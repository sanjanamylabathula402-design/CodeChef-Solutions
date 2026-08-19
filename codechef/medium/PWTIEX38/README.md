# PWTIEX38

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example-Understanding Object References

In this example, we will demonstrate how object references work in Java. We will create two `Book` objects and assign one object reference to another. After modifying the attributes of one object, we will observe how both references point to the same object.

 **Expected Output:** 

```
Modified Book Details:
Title: Book of Power
Author: J.K Nayak
Price: 1499.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:42:15.568Z  

```java
// The Book class defined here for reference assignment example
class Book {
    String title;
    String author;
    double price;
}


class Codechef {
    public static void main(String[] args) {
        // Creating the first Book object
        Book firstBook = new Book();
        firstBook.title = "Book of Justice";  // Initializing title
        firstBook.author = "J.K Nayak";       // Initializing author
        firstBook.price = 1299.0;             // Initializing price

        // Assigning the reference of firstBook to secondBook
        Book secondBook = firstBook;  // Object reference assignment

        // Modifying secondBook's details
        secondBook.title = "Book of Power";  // Changing the title
        secondBook.price = 1499.0;          // Changing the price

        // Displaying modified details through firstBook reference
        System.out.println("Modified Book Details:");
        System.out.println("Title: " + firstBook.title);   // Accessing through firstBook
        System.out.println("Author: " + firstBook.author); // Accessing through firstBook
        System.out.println("Price: " + firstBook.price);   // Accessing through firstBook
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX38)