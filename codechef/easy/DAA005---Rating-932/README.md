# DAA005 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Selection Sort

Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list.

The algorithm works as:

- Set an index to the start of the unsorted array.
- Now search for the index of the smallest element and swap it with the start index.
- Since the first index is now sorted, increment the start index and repeat the process until the start index reaches the end of the array.
### Task

Selection sort is implemented in the IDE, but is incomplete.
Complete it to solve the problem.

### Sample 1:
Input
Output

```
5
5 4 3 2 1
```

```
1 2 3 4 5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T09:57:39.365Z  

```java
import java.util.*;

public class Main {
    public static void sort (int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int min_val = arr[i];
            int min_idx = i;
            for(int j = i + 1; j < n; j++) {
                if(min_val > arr[j]) {
                    min_val = arr[j];
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sort(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DAA005)