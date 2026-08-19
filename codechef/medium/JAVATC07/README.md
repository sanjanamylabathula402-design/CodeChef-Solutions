# JAVATC07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### We can handle 2 errors

Write a Java program that accesses an element from an ArrayList based on user input. The program should handle the following cases:

- The user enters a non-numeric value as an index.
- The user enters an index that is out of range for the ArrayList.

The program should display appropriate error messages instead of crashing.

 **HINT :**  Use NumberFormatException and IndexOutOfBoundsException.

### Input Format
- The user will enter an index number to access an element from the ArrayList.
### Output Format
- If the index is valid, the program will display the corresponding element from the ArrayList.
- If the index is out of range, the program will display an error message.
- If the user enters a non-numeric value, the program will display an error message.
### Sample 1:
Input
Output

```
2
```

```
5
```

### Sample 2:
Input
Output

```
10
```

```
Error: Index out of range
```

### Sample 3:
Input
Output

```
hey
```

```
Error: Please enter a number
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:07:55.725Z  

```java
import java.util.Scanner;
import java.util.ArrayList;

 class Codechef {
    public static void main(String[] args) {
        // Creating and initializing the ArrayList
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(5);
        myList.add(9);
        myList.add(10);
        myList.add(11);

        Scanner scanner = new Scanner(System.in);

        try {
            // Read user input and convert to integer
            int index = Integer.parseInt(scanner.nextLine());

            // Access the element at the given index
            System.out.println(myList.get(index));
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a number");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range");
        }

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JAVATC07)