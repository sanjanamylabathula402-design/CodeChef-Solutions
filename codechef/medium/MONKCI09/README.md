# MONKCI09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:27:25.106Z  

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        
        // Adding initial tasks
        todoList.add("Buy groceries");
        todoList.add("Do laundry");
        todoList.add("Pay bills");
        todoList.add("Call mom");
        todoList.add("Walk dog");
        
        System.out.println("Original list: " + todoList);
        
        // Remove task at index 2 ("Pay bills")
        todoList.remove(2);
        System.out.println("After removing index 2: " + todoList);
        
        // Remove "Call mom" by object
        todoList.remove("Call mom");
        System.out.println("Final to-do list: " + todoList);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI09)