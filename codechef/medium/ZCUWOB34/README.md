# ZCUWOB34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Identify the Correct Code

Which of the following code snippets correctly prints numbers from `2` to `20`, incrementing by `3` in each iteration while skipping numbers that are divisible by `5`?

A.

```
int start = 2, end = 20;  
for (int i = start; i <= end; i += 3) {  
    if (i % 5 != 0) {  
        continue;  
    }  
    System.out.println(i);  
}

```

B.

```
int start = 2, end = 20;  
for (int i = start; i >= end; i += 3) {  
    if (i % 5 == 0) {  
        continue;  
    }  
    System.out.println(i);  
}

```

C.

```
int start = 2, end = 20;  
for (int i = start; i <= end; i += 3) {  
    if (i % 5 == 0) {  
        continue;  
    }  
    System.out.println(i);  
}

```

D.

```
int start = 2, end = 20;  
for (int i = start; i <= end; i++) {  
    if (i % 5 == 0) {  
        break;  
    }  
    System.out.println(i);  
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:41:53.950Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int start = 1; // Starting number
        int end = 20;  // Ending number

        // Loop from start to end with a step value of 4
        for (int i = start; i <= end; i += 4) { // Increment by 4 in each iteration
            
            // Check if the number is a multiple of 3
            if (i % 3 == 0) { 
                continue; // Skip multiples of 3 and move to the next iteration
            }

            System.out.println(i); // Print numbers that are not multiples of 3
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB34)