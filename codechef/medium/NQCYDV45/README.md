# NQCYDV45

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Number is Even or Odd

Jason is writing a program to check if a number is even, but it is giving him some error.

Jason’s Code is Below:

```
int number = 4;
if (number % 2 = 0) { 
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

```

 **Expected Output** 

```
Even

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T16:56:53.019Z  

```cpp
class CodeChef {
    public static void main(String[] args) {
    // Initialize the string
    String string = "12345";
    // Potential Logical Error: Ensure the correct loop range is used
    for (int i = 0; i < string.length(); i++) {
        System.out.println(string.charAt(i));
    }
    System.out.println("The elements of the list are: " + string);  

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NQCYDV45)