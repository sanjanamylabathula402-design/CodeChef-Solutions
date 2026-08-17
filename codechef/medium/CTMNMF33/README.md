# CTMNMF33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Incoming Requests

In this example, we are going to demonstrate a simple simulation of a server that continuously processes incoming requests using an infinite loop in Java. The server indicates that it is operational by repeatedly displaying the message "Server is running".

**You will get a Time limit exceeded error because we have not terminated the loop.
To get AC (Accepted) in this problem, use break inside the while loop — it immediately stops the loop. We’ll discuss more about break later on.**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:23:49.607Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int num = 10; // Start checking from 10

        while (num <= 20) { // Loop runs until 20
            if (num % 3 == 0) { // Check if num is a multiple of 3
                System.out.println("First multiple of 3 found: " + num);
                break; // Exit the loop once found
            }
            num++; // Increment num to check the next number
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF33)