# CDLYPA10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reading a Specific Byte

In this example, we read a specific byte from a text file and print it to the console. The file `byte.txt` is already saved at the specified location.

 **File Path** :
You can use either of the below paths:

- /home/chef/workspace/read.txt
- read.txt

Observe the function implementation, and click the "Submit" button to run the tests.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:59:37.343Z  

```cpp
import java.io.RandomAccessFile;
import java.io.IOException;

class Codechef {

    // Function to read a specific byte from the file
    public static char readSpecificByte(String filepath, int position) {
        try {

            RandomAccessFile file = new RandomAccessFile(filepath, "r");
            // Directly move to the specified position
            file.seek(position); 

            // Read and display the byte at the position
            byte data = file.readByte();
            
            return (char)data;  // data is in integer/number form, so here we are converting it to character
        } catch (IOException e) {
```

---

[View on CodeChef](https://www.codechef.com/problems/CDLYPA10)