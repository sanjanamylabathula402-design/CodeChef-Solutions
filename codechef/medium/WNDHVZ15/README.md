# WNDHVZ15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Distributing Books Evenly

A school is distributing books among students. Write a program that takes user input for the total number of books and the number of students. Use division (`/`) to calculate how many books each student will receive and modulus (`%`) to determine if any books remain undistributed.

 **Input:** 

- An integer representing the total number of books.
- An integer representing the number of students.
### Sample 1:
Input
Output

```
20
5
```

```
Each student gets 4 books equally.

```

### Sample 2:
Input
Output

```
23
5
```

```
Each student gets 4 books, but 3 books remain undistributed.

```

### Sample 3:
Input
Output

```
19
5
```

```
Each student gets 3 books, but 4 books remain undistributed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:35:01.706Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for total books and number of students
        int totalBooks = scanner.nextInt();

        int students = scanner.nextInt();

        // Calculating books per student and remaining books
        int booksPerStudent = totalBooks / students;
        int remainingBooks = totalBooks % students;

        // Printing the output based on the condition
        if (remainingBooks == 0) {
            System.out.println("Each student gets " + booksPerStudent + " books equally.");
        } else {
            System.out.println("Each student gets " + booksPerStudent + " books, but " + remainingBooks + " books remain undistributed.");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ15)