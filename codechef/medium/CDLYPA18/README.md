# CDLYPA18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Basic File Existence Check

In this example, we check if a file exists in Java using the File class.

 **File Path:**  You can use either of the below paths:

- /home/chef/workspace/Existence.txt
- Existence.txt

Observe the function implementation and click the "Submit" button to run the tests.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:01:02.395Z  

```cpp
import java.io.File;

class Codechef {
    // Define a function to check file existence
    public static boolean doesFileExist(String filepath) {
        File file = new File(filepath);
        return file.exists(); // Returns true if the file exists
    }

    public static void main(String[] args) {
        String filepath1 = "/home/chef/workspace/Existence.txt"; 
        String filepath2 = "/home/chef/workspace/temp.txt"; 

        // Call the function to check file existence
        if (doesFileExist(filepath1)) {
            System.out.println("The file '" + filepath1 + "' exists.");
        } else {
            System.out.println("The file '" + filepath1 + "' does not exist.");
```

---

[View on CodeChef](https://www.codechef.com/problems/CDLYPA18)