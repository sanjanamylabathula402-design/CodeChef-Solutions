# CTMNMF33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Incoming Requests

In this example, we are going to demonstrate a simple simulation of a server that continuously processes incoming requests using an infinite loop in Java. The server indicates that it is operational by repeatedly displaying the message "Server is running".

**You will get a Time limit exceeded error because we have not terminated the loop.
To get AC (Accepted) in this problem, use break inside the while loop — it immediately stops the loop. We’ll discuss more about break later on.**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:23:55.832Z  

```java
class Codechef {
    public static void main(String[] args) {
     
        while(true)
        {
             System.out.println("Server is running");
             break;
        }
    
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF33)