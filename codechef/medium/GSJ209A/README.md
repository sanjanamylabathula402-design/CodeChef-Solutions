# GSJ209A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### What are test cases

Listen

In the previous module, we practiced simple methods of  ***`input`**  *and  ***`output`***  used in programming problems.

Let us take the next small step and learn about  **`test cases`**.
You will find the concept of `'test cases'` on various programming platforms. What are  **`test cases`** ?

- Test cases are multiple Inputs - multiple instances of the same problem, all of which have to be solved by your code correctly.

```
  - Example 1: Consider 5 test cases or 5 inputs
    11
    13
    2
    4
    9

```

### Task

Let's solve a simple problem.
Write a program in the `IDE` which does the following:

- Accepts 5 inputs given on 5 separate lines. Each input is an integer N.
- For each test cases, prints out the integer N to console on a separate line (our Input mirror problem).
### Sample 1:
Input
Output

```
11
123
34
22
45
```

```
11
123
34
22
45
```

### Explanation:

Since the count of `test cases` is 5 -> we accept 5 inputs and print 5 outputs.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T09:14:54.702Z  

```java
// Update the '_' in the code below
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        
        String A = read.next();
        String B = read.next();
        String C = read.next();
        String D = read.next();
        String E = read.next();
        // You can use "\n" to add a new line instead of adding multiple print statements
        System.out.print(A + "\n" + B + "\n" + C + "\n" + D + "\n" + E );
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GSJ209A)