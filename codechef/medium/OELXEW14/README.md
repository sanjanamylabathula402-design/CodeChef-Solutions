# OELXEW14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Update Marks in an Array

You are given an array that stores the marks of 3 students.

Write a Java program to update marks of each student by 2.

 **Expected Output** 

```
Updated Marks:
50
72
88

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:13:19.665Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the array
        int[] marks = {48, 70, 86};

        // Step 2: Update each element manually (no loop)
        marks[0] = marks[0] + 2;
        marks[1] = marks[1] + 2;
        marks[2] = marks[2] + 2;

        // Step 3: Print updated elements manually
        System.out.println("Updated Marks:");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OELXEW14)