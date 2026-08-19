# TWOLMM22

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Write to a File

In this example, we have written text content to a file using Java's `FileWriter`. The file `output.txt` is created at the specified location.

 **File Path:** 
You can use either of the below paths:

- /home/chef/workspace/output.txt
- output.txt

 **Don't forget to see the changes in the output.txt file**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:56:08.774Z  

```cpp
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class Codechef
{
    public static void writeToFile(String filepath, String content){
        try {
            // Create a FileWriter object for writing to a file
            FileWriter writer = new FileWriter(filepath);

            // Write text to the file
            writer.write(content);

            // Close the writer to save changes
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM22)