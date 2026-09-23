# LPYAS40

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print the length

Write a program to print the length of each word of the sentence given below as well as the length of the whole sentence.
 **"Coding on CodeChef"** 

#### Note:

There is spacing between the words and the number, consider it while printing the outputs.

 **Note:**  Please print the outputs in the same format as given below.

### Output Format

Coding - 6
on - 2
CodeChef - 8
Coding on CodeChef - 18

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T06:35:25.428Z  

```py
# cook your dish here
string1 = "coding"
string2 = "on"
string3 = "codechef"
string = string1 + " "+ string2 + " " + string3
print(string1 + " - "  + str(len(string1)))
print(string2 + " - " + str(len(string2)))
print(string3 +" - "+ str(len(string3)))
print(string +" - "+ str(len(string)))
```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS40)