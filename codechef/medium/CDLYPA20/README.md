# CDLYPA20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check if a File Exists

In this task, you need to check if at least one of the two given files exists in the specified directory. The file paths are already provided.

 **Steps to Follow** 

- Create File Objects Use the File class to create objects for both file paths.
- Check File Existence Use the exists() method to verify whether either file is present. Return true if at least one of the files exists; otherwise, return false.
- Handle exceptions If an error occurs while accessing the files, handle it gracefully.

 **Expected Output** 

If `sample.txt` exists but `sample1.txt` does not, the function will return:

```
true

```

If neither file exists, the function will return:

```
false

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:02:14.364Z  

```cpp
import java.io.File;

class Codechef {
    // Function definition: checks if a file exists with exception handling
    public static boolean isFileExists(String filePath1, String filePath2) {
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);

        return file1.exists() || file2.exists();
    }

    public static void main(String[] args) {
        // File path to check
        String filePath1 = "/home/chef/workspace/sample.txt";
        String filePath2 = "/home/chef/workspace/sample1.txt";

        // Function call
        System.out.println(isFileExists(filePath1, filePath2));
```

---

[View on CodeChef](https://www.codechef.com/problems/CDLYPA20)