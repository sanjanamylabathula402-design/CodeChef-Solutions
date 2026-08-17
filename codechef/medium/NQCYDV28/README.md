# NQCYDV28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Compilation error continued

How do you identify `Compilation error`?

When you run your code and there is an error, you will typically see it in the output.

For example if you run the below code, you will get a syntax error.

```
class CodeChef {
    public static void main(String[] args) {
        String name = "piyush";
        if (name == "piyush")
            System.out.println(name)
    }
}

```

 **Error** 

```
Main.java:5: error: ';' expected
            System.out.println(name)
                                    ^
1 error

// The error description says that there is a error on line 5.
// The exact error is explained on the last line of the description: `SyntaxError: expected ';'`.

```

It is clearly saying that a ; (semi-colon) is expected after the println statement.
The error goes away after adding ; (semi-colon).

### Task
- Submit the code present in IDE as it is.
- Read the error statement and understand what needs to be fixed.
- Fix the code so that it correctly outputs: "Even".

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T16:54:59.015Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/NQCYDV28)