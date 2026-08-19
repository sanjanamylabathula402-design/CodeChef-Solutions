# TWOLMM16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Longest Comment Length

In this task, you need to read a text file and determine the length of the  **longest line**  (comment) in the file. The file `comments.txt` is already saved at the specified path.

 **Steps to Follow** 

- Read all lines from the file Use Files.readAllLines(Paths.get(filePath)) to read the entire file. This returns a List<String> where each element is one line from the file.
- Find the longest line Create a variable maxLength and initialize it to 0. Loop through the list of lines using a for loop. For each line, check its length using.length(). Update maxLength if the current line is longer than the current maxLength.
- Handle errors Wrap the file reading code in a try-catch block. If there’s an IOException, print an error message and return -1.

 **Expected Output:** 

```
15

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:54:37.451Z  

```cpp
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return -1;
        }
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        String filePath = "comments.txt";  // File path to be read
        System.out.println(findLongestComment(filePath));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM16)