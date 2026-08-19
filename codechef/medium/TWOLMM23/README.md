# TWOLMM23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Save User Details

In this task, you need to write content to a file using Java. The file `userDetails.txt` should be  **created or overwritten**  with the given content.

 **File Path:** 
You can use either of the below paths:

- /home/chef/workspace/userDetails.txt
- userDetails.txt

 **Steps to Follow** 

- Define a method saveUserDetails It should take two parameters: the file path and the content to write.
- Create a FileWriter object Use FileWriter writer = new FileWriter(filepath); This will create the file if it doesn’t exist or overwrite it if it does.
- Write to the file Use writer.write(content); to write the given string to the file.
- Close the writer Always call writer.close(); to ensure the content is saved properly and resources are freed.
- Handle exceptions Wrap the file writing code in a try-catch block. If any IOException occurs, print: An error occurred.

 **Don't forget to see the changes as you run the code**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:57:01.947Z  

```cpp
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        String content = "{name : Test, age: 45, city: London}";
        String filepath = "/home/chef/workspace/userDetails.txt";
        saveUserDetails(filepath, content);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM23)