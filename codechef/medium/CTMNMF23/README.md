# CTMNMF23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Countdown Timer

In this example, the countdown timer demonstrates a step decrement loop, where the loop variable decreases by one in each iteration until it reaches a defined limit.
This highlights the use of a while loop for effectively and safely decrementing values.
The program starts at a given countdown value and decreases step by step until reaching zero, printing each value to visually track the countdown process.

### Sample 1:
Input
Output

```
10
```

```
Counting down from 10:
10
9
8
7
6
5
4
3
2
1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:22:11.126Z  

```java
class Codechef {
    public static void main(String[] args) {
        int countdown = 10; // Initialize the countdown starting value

        System.out.println("Counting down from 10:");
        while (countdown > 0) { // Loop until the countdown reaches zero
            System.out.println(countdown); // Print the current value of countdown
            countdown -= 1; // Decrement the countdown by 1
        }
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF23)