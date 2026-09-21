# GSJ208

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### How to accept string inputs

Lets try the same exercise with strings.

### Task

You need to write a program which does the following

- Accepts $2$ space separated alphanumeric strings as input in $1^{st}$ line as the variables $A$, $B$
- Accepts $3$ space separated alphanumeric strings as input in $2^{nd}$ line as the variables $C$, $D$, $E$
- Prints out $5$ space separated strings as output in a single line to the console

Solve the problem in the IDE and then click on  **Submit**  to proceed.

### Sample 1:
Input
Output

```
abc cde
fg hi jk
```

```
abc cde fg hi jk
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T09:12:18.338Z  

```java
//  Update the '_' in the code below
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
        System.out.print(A + " " + B + " " + C + " " + D + " " + E );
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GSJ208)