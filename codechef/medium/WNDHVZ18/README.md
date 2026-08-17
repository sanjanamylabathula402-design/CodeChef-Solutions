# WNDHVZ18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Checking Payment Status

In this example, we demonstrate how to use an if-else statement with the != (Not Equal) operator to check if a payment has been completed. This method helps in understanding conditional execution in Java.

 **When executed, the code will show:** 

```
Your payment is still pending. Please complete it.  
Payment status check completed.  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:35:43.504Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Variable representing payment status
        String paymentStatus = "Pending";

        // Check if the payment is completed
        if (paymentStatus != "Completed") {
            System.out.println("Your payment is still pending. Please complete it.");
        } else {
            System.out.println("Your payment has been successfully completed.");
        }

        System.out.println("Payment status check completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ18)