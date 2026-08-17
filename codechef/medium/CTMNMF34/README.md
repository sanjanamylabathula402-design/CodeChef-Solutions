# CTMNMF34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Logical Condition

Consider the following code. What will happen when the program is executed?

```
class Codechef {
    public static void main(String[] args) {
        int num = 5;
        while (num != 0) {
            System.out.println("This will never end");
            num++;
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:24:07.726Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/CTMNMF34)