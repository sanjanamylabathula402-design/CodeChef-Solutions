# BMJ206 - Rating 450

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice problem - Fitness

Another practice problem for you.

Chef wants to become fit for which he decided to  **walk to**  the office and  **return**  home by walking.
It is known that Chef's office is $X$ km away from his home.
If his office is open on $5$ days in a week, find the number of kilometres Chef travels through office trips in a week.

 **Hint** 

- Return trips imply that $2$*$X$ distance is travelled each day
### Input Format
- The first line of input contains $T$ - the number of test cases.
- Each of next $T$ lines contains a number $X$ - distance of Chef's office from his of home.
### Output Format
- For each test cases, print the number of kilometres Chef travels through office trips in a week, on a new line.
### Sample 1:
Input
Output

```
2
1
3
```

```
10
30
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T13:17:30.482Z  

```java
// Solution as follows
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
        	int x = read.nextInt();
        	
        	// Create a new variable Y for total distance.
        	// 5 days a week - Chef will travel 2*X daily - i.e. return trip walk to office
        	int y = 2 * x * 5;
        	
        	// Print the distance travelled for each test case.
        	System.out.println(y);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BMJ206)