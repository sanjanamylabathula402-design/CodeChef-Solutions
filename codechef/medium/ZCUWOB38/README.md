# ZCUWOB38

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Loop Variable Scope in Java

In this example, we demonstrate how loop variable scope affects accessibility inside and outside a loop. A variable declared inside the loop is limited to that loop, while one declared outside remains accessible after the loop ends.

 **When executed, the code will show:** 

```
Inside loop: 5  
Inside loop: 6  
Inside loop: 7  
Inside loop: 8  
Inside loop: 9  
Outside loop: 10  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:43:01.258Z  

```java
class Codechef {
    public static void main(String[] args) {
        int j = 5; // Loop variable declared outside

        // Loop increments j from 5 to 9
        for ( ; j <= 9; j++) {  // it is optional to write initial statement, condition and increment statement
            System.out.println("Inside loop: " + j);  
        }

        // j retains its value and is accessible here
        System.out.println("Outside loop: " + j); 
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB38)