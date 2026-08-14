# HDHCEH12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Accessing members using Dot operator
- You are given an Account class for which the transaction1 object is being created. Try to access the t_id and amount data members using the (.) Dot operator.
- Assign the value 1003 to t_id and 50,000 to amount.

 **Once your code is executed, the output should look as follows:** 

```
The transaction ID is 1003
The amount spent is 50000.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:34:49.706Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Account{
    int t_id;
    float amount;
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Account transaction1 = new Account();
 
       // access data members t_id and amount from object transcaction1 and then assign values to them
       
       transaction1.t_id=1003;
       transaction1.amount=50000.0f;
       

        // access  t_id from transcation1 to print 
        System.out.println("The transaction ID is "+ transaction1.t_id);
        // access  amount from transcation1 to print 
        System.out.println("The amount spent is "+ transaction1.amount);
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HDHCEH12)