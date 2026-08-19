# TWOLMM30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Append Lines to a File

In this example, we have appended two lines of text to an existing file using Java’s `FileWriter`. The file `output.txt` is updated with the new content.

 **File Path:** 
You can use either of the below paths:

- /home/chef/workspace/output.txt
- output.txt

 **Don't forget to see the changes as you run the code**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:58:13.268Z  

```cpp
import java.io.FileWriter;
import java.io.IOException;

class Codechef
{
    public static void addLinesToFile(String filepath, String lineOne, String lineTwo){
        try {
            // Create a FileWriter in append mode
            FileWriter writer = new FileWriter(filepath, true);

            // Append text to the file with line breaks
            writer.write(lineOne + "\n");
            writer.write(lineTwo + "\n");

            // Close the writer to save changes
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM30)