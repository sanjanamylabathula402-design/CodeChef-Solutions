# TWOLMM24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Write First Ten Characters to File

In this task, you need to write the first ten characters of a given content string to a text file. The file `output.txt` is already saved at the specified path.

 **Steps to Follow** 

- Extract the first ten characters If the content string has 10 or more characters, extract the first 10. Otherwise, use the entire string.
- Write the extracted text to the file Open the file in write mode. Write the extracted text to the file.
- Handle exceptions If an error occurs while writing to the file, print "An error occurred."

 **Expected Output** 
If the input content is:

```
"This is a temporary fileThis is a temporary file"

```

The first ten characters are:

```
"This is a"

```

After execution, `output.txt` will contain:

```
This is a 

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:57:48.004Z  

```cpp
            // Close the writer to save changes
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        String content = "This is a temporary fileThis is a temporary file";
        String filepath = "/home/chef/workspace/output.txt";
        writeToFile(filepath, content);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM24)