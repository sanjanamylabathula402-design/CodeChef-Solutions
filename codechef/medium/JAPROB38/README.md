# JAPROB38

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Word Counter - Reading Text from File

In this component, you will implement functionality to read text from a file. File handling is a crucial aspect of programming, allowing applications to access and process external data efficiently. Java provides classes like `Files` and `Paths` to make this process simple and effective.

 **Reading a File in Java** 
To read text from a file, you can use Java’s `Files.readString()` method. It reads the entire file content into a single String and requires a file path, which can be constructed with `Paths.get()`.

 **Syntax for Reading a File** 

```
String content = Files.readString(Paths.get(filepath));

```

 **File Path for input.txt** 
The file path for input.txt is:

```
/home/chef/workspace/input.txt

```

### Task

Complete the function `readFile()` to correctly read the content of `input.txt`.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:07:45.072Z  

```cpp
public class Codechef {

    //---------------------------------------------------------
    public static String readFile(String filepath) {
        try {
            String content = Files.readString(Paths.get(filepath));
            return content;  
        } catch (IOException e) {
            System.out.println("Error reading file.");
             return "";
        }
    }
    //---------------------------------------------------------

    public static void main(String[] args) {
        System.out.println("Welcome to the Word Counter!\n");

        String filepath = "input.txt";
        String text = readFile(filepath);

        System.out.println(text);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB38)