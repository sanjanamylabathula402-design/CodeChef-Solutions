# PWTIEX36

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Book Information Collector

Write a program to store and display details of multiple books. The program should use a class with instance variables to store the title and author of a book. Use a  **loop**  to take input dynamically for a given number of books and store their details.

 **Input:** 

- An integer representing the number of books.
- For each book, input: A string representing the book title. A string representing the book author.
### Sample 1:
Input
Output

```
2
Java Programming
James Smith
Data Structures
Alice Brown
```

```
Book 1 Details:
Title: Java Programming
Author: James Smith
Book 2 Details:
Title: Data Structures
Author: Alice Brown

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:41:43.001Z  

```java
import java.util.Scanner; // Import Scanner for user input

// Book class with default field initialization
class Book {
    String title = "Unknown Title"; // Default value for title
    String author = "Unknown Author"; // Default value for author
}

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        // Prompt user to enter the number of books
        int numBooks = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        // For loop to input details for multiple books
        for (int i = 1; i <= numBooks; i++) {
            Book myBook = new Book(); // Create a new Book object

            // Prompt user to enter book details
            myBook.title = sc.nextLine(); // Assign user input to title
            
            myBook.author = sc.nextLine(); // Assign user input to author
            // Display book details
            System.out.println("\nBook " + i + " Details:");
            System.out.println("Title: " + myBook.title);
            System.out.println("Author: " + myBook.author);
            System.out.println(); // Adding a blank line for readability
        }

        sc.close(); // Close scanner
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX36)