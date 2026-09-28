# MSTRW

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Minimum String Weight

Chef is preparing a string $S$ for storage. Its  **weight**  is the sum of the squares of the frequencies of its distinct characters.

For example, the weight of aab is $2^2+1^2=5$.

Chef must remove  **exactly $K$ characters**  from $S$. The removed characters may come from any positions. Find the  **minimum possible weight**  of the remaining string.

An empty string has weight $0$.

### Input Format
- The first line contains the string $S$. This line may be empty.
- The second line contains an integer $K$, the number of characters to remove.
### Output Format

Print a single integer — the minimum possible weight after exactly $K$ removals.

### Constraints
- $0 \le K \le 5\times10^4$
- $1 \le |S| \le 5\times10^4$
- $K \le |S|$
- Every character of $S$ is a lowercase English letter.
### Sample 1:
Input
Output

```
abccc
1
```

```
6
```

### Explanation:

Remove one occurrence of c. The remaining frequencies are $1$, $1$, and $2$, giving weight $1^2+1^2+2^2=6$.

Removing a or b instead would leave weight $10$, so $6$ is the minimum.

### Sample 2:
Input
Output

```
aabcbcbcabcc
3
```

```
27
```

### Explanation:

The frequencies of a, b, and c are $3$, $4$, and $5$. Remove one b and two copies of c to leave frequency $3$ for every character.

The weight is $3^2+3^2+3^2=27$. This equal distribution minimizes the weight of the nine remaining characters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T16:08:40.077Z  

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int K = sc.nextInt();

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Max heap
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int f : freq) {
            if (f > 0) {
                pq.add(f);
            }
        }

        // Remove K characters
        while (K > 0) {
            int maxFreq = pq.poll();

            maxFreq--;

            if (maxFreq > 0) {
                pq.add(maxFreq);
            }

            K--;
        }

        long answer = 0;

        for (int f : pq) {
            answer += (long) f * f;
        }

        System.out.println(answer);

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MSTRW)