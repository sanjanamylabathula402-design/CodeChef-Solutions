# CTMNMF30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check Multiples of 3 and 5

Write a program that prints all numbers from 1 to n which are divisible by both 3 and 5 using a while loop.

 **Input:**  Take input for n from the user.

 **Steps to complete:** 

- Use a while loop to run from i = 1 to i <= n.
- Inside the loop, check if the number is divisible by both 3 and 5 using %. If true, print the number. If false, then dont output anything
- Increment i in each iteration.
### Sample 1:
Input
Output

```
15

```

```
15
```

### Sample 2:
Input
Output

```
30
```

```
15
30
```

### Sample 3:
Input
Output

```
11
```

```
 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:23:14.546Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF30)