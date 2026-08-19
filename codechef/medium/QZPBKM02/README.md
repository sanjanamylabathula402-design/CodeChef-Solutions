# QZPBKM02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Read Employee CSV File

In this example, we read the contents of a CSV file using  **Java’s `FileReader`**  along with the  **OpenCSV library**. This approach handles commas, quotes, and edge cases more reliably than manual splitting.

 **File Path** 

You can use either of the below paths depending on your setup:

- Absolute path: /home/chef/workspace/Employees.csv
- Relative path: Employees.csv (if the file is in the same folder as your.java file)

 **You can see the content of Employees.csv file** 

 **Output** 

```
Row 0: Name Designation Salary 
Row 1: John Manager 75000 
Row 2: Emma Developer 55000 
Row 3: Sophia Designer 60000 

```

 **What’s Happening Here?** 

- FileReader reads the file just like a text file reader.
- CSVReader (from OpenCSV) reads one row at a time and splits the row into values automatically, even if the data contains commas or quotes.
- Each row is returned as a String[], which we loop through using a normal for loop to print values cleanly.
- This is safer and cleaner than using split(",") manually, especially for real-world data.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:20:10.748Z  

```cpp
import com.opencsv.CSVReader;
import java.io.FileReader;

public class Codechef {
    public static String filePath = "/home/chef/workspace/Employees.csv"; 

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(filePath);
            CSVReader csvReader = new CSVReader(fileReader);

            String[] row = csvReader.readNext();
            int rowNum = 0;

            while (row != null) {
                System.out.print("Row " + rowNum + ": ");
                for (int i = 0; i < row.length; i++) {
                    System.out.print(row[i] + " ");
```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM02)