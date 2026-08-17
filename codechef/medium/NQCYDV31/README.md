# NQCYDV31

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Number is greater or not

```
class CodeChef {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5)
            System.out.println("x is greater than 5");
    }
}

```

What will we get when the code is executed?

Option 1: Error

```
SyntaxError: expected ; after condition

```

Option 2: Error

```
Missing braces {} around if-statement body

```

Option 3: Error

```
NameError: variable 'x' might not have been initialized

```

Option 4: No error - code will compile correctly with the following output

```
x is greater than 5

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T16:55:13.281Z  

```cpp
class CodeChef {
    public static void main(String[] args) {
        int age = 28;
        if (age % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NQCYDV31)