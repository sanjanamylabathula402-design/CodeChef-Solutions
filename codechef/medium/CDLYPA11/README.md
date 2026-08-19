# CDLYPA11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Updating Data in the Middle of a File

In this task, you need to read a specific byte from a file using Java. The file `read.txt` should already exist at the specified location.

 **File Path:** 
You can use either of the below paths:

- /home/chef/workspace/read.txt
- read.txt

 **Steps to Follow:** 

- The readByte function should reference the given file path.
- Use Java’s RandomAccessFile to open the file in read mode.
- Move the file pointer to the specified byte position using seek(position).
- Read the byte at the given position and return it as a character.
- Handle exceptions properly to ensure a default value is returned in case of file access issues.
- If an error occurs while reading the file, return the character '0'.

 **Expected Output** 

```
d

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:00:05.448Z  

```cpp
        } catch (IOException e) {
            return '0';
        }
    }

    public static void main(String[] args) {
        String filepath = "/home/chef/workspace/read.txt"; // Ensure the file exists
        int position = 9;               // Position of the byte to read (0-based indexing)

        // Call the function to read the specific byte
        System.out.println(readByte(filepath, position));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CDLYPA11)