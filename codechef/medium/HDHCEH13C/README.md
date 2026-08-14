# HDHCEH13C

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Assigning object reference variables

```
   Variable v1 = new Variable();
   v1.value = 3;
   Variable v2 = v1;
   v2.value =  7;

```

What do you think that  **v1.value**  and  **v2.value**  are— **different, or are they the same** ? Run the code given in IDE and observe it carefully.

Isn't it surprising that instead of getting  **3**  and  **7**, we are getting the value  **7**  for  **both objects** ? But that's how objects behave:  **v1**  and  **v2**  are  **not actual objects** ; they are just  **references to the objects**, and when you say  **v2 = v1**, you are just  **assigning the same reference**  to  **v2**  as the one that was given to  **v1**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:43:06.197Z  

```java
class Variable {
    // variable
    int value;
}

public class Main {
    public static void main(String[] args) {
        // object creation for rectangle class
        Variable v1 = new Variable();
        v1.value = 3;
        Variable v2 = v1;
        v2.value = 7;
        System.out.println("Value of v1 is "+ v1.value);
        System.out.println("Value of v2 is "+ v2.value);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HDHCEH13C)