# QZPBKM06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Write Employee Data to CSV File

In this example, we write structured data to a CSV file using  **Java’s `FileWriter`**  along with the  **OpenCSV library**. This approach handles formatting automatically—like commas, quotes, and special characters—so we don't have to manually build strings.

 **File Path** 

You can save the file using either:

- Absolute path: /home/chef/workspace/Employees.csv
- Relative path: Employees.csv (will be created in the same folder as your.java file)

 **After writing, you can open the Employees.csv file and see its contents.** 

 **What’s Happening Here?** 

- FileWriter opens a new file (or overwrites an existing one) for writing text.
- CSVWriter (from OpenCSV) makes it easy to write rows to a CSV file by simply passing a String[].
- We first write a header row, then add multiple data rows, each as a string array.
- The library automatically adds commas between values and handles any quotes or special characters if needed.
- This is much safer and easier than manually concatenating strings or handling edge cases.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:32:01.731Z  

```cpp
import com.opencsv.CSVWriter;
import java.io.FileWriter;

public class Codechef {
    public static String filePath = "/home/chef/workspace/Employees.csv"; 

    public static void main(String[] args) {
        try {
            // Step 1: Create a FileWriter to write to the file
            FileWriter fileWriter = new FileWriter(filePath);

            // Step 2: Wrap FileWriter with CSVWriter from OpenCSV
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            // Step 3: Write header row
            String[] header = { "Name", "Designation", "Salary" };
            csvWriter.writeNext(header);

```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM06)