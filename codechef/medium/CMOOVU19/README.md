# CMOOVU19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fill in the Blank - Nested Loop 2D Array Traversal

Complete the missing parts in the code that initializes a 3×5 matrix with sequential values starting from 10 and prints each element along with its row and column indices.

 **Expected output:** 

```
Element at [0][0] = 10
Element at [0][1] = 11
Element at [0][2] = 12
Element at [0][3] = 13
Element at [0][4] = 14
Element at [1][0] = 15
Element at [1][1] = 16
Element at [1][2] = 17
Element at [1][3] = 18
Element at [1][4] = 19
Element at [2][0] = 20
Element at [2][1] = 21
Element at [2][2] = 22
Element at [2][3] = 23
Element at [2][4] = 24

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:33:33.748Z  

```java
class codechef {
    public static void main(String[] args) {
        int[][] dataTable = new int[3][5];  // Declare a 3x5 matrix

        // Populate the array with sequential numbers starting from 10
        int num = 10;
        for (int i = 0; i < dataTable.length; i++) {
            for (int j = 0; j < dataTable[i].length; j++) {
                dataTable[i][j] = num++;
            }
        }

        // Iterate and print each element with its position
        for (int i = 0; i < dataTable.length; i++) {
            for (int j = 0; j < dataTable[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] = " + dataTable[i][j]);
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CMOOVU19)