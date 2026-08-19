# CDLYPA12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Read Middle Byte

In this task, you need to update an existing file by writing new data at a specific. The file `middle.txt` is already saved at the specified path.

 **Steps to Follow** 

- Open the file Use RandomAccessFile in read-write mode ("rw") to allow modification.
- Move to the specified position Use seek(position) to set the file pointer to the given position.
- Write new data Use writeBytes(newData) to overwrite the content from the given position onward. Only the specified bytes are modified; the rest of the file remains unchanged.
- Handle exceptions If the file does not exist or cannot be accessed, print an error message. If position exceeds the file length, handle it gracefully.

 **Expected Output** 

```
Updated the file starting at position 10 with data: UPDATED

```

 **Don't forget to see the changes in `middle.txt` as you run the code.**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:00:33.859Z  

```cpp
        try 
           (RandomAccessFile file = new RandomAccessFile(filepath, "rw")) {
            // Move to the specific position
            file.seek(position); // 0-based indexing

            // Overwrite the data starting at the specified position
            file.writeBytes(newData);
            System.out.println("Updated the file starting at position " + position + " with data: " + newData);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filepath = "/home/chef/workspace/middle.txt"; // Ensure the file exists
        String newData = "UPDATED";      // Data to be written
        int position = 10;               // Position to start writing (0-based indexing)

```

---

[View on CodeChef](https://www.codechef.com/problems/CDLYPA12)