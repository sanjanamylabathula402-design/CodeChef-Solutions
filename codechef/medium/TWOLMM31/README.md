# TWOLMM31

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Append Logs to File

In this task, you need to append log messages to a file using Java. The file `logs.txt` should be updated with the provided log messages without overwriting existing content.

 **File Path:** 
You can use either of the below paths:

- /home/chef/workspace/logs.txt
- logs.txt

 **Steps to Follow:** 

- Open the file in append mode Use FileWriter(filepath, true) to open the file in append mode. This ensures that new content is added to the end of the file without overwriting the existing data.
- Write log1 to the file Use the write() method of FileWriter to append the first log. Append a new line after log1 using write(log1 + "\n") so the next log starts on a new line.
- Write log2 to the file Use the write() method again to append the second log (log2) to the file. Ensure this log also appears on a new line by appending "\n" after the log.
- Close the FileWriter After writing both logs, close the FileWriter to save the changes and release the file resources. Use writer.close() to properly close the file.
- Handle exceptions Ensure the IOException is caught and handled if the file operation fails. In this case, print a message: "An error occurred".

 **Don't forget to see the changes as you run the code**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:58:37.569Z  

```cpp
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        String filepath = "/home/chef/workspace/logs.txt";
        String log1 = "log 1";
        String log2 = "log 2";
        addLogsToFile(filepath, log1, log2);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM31)