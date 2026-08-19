# QZPBKM03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reading User Login Details from a CSV File

You are given a partial Java program that reads and prints the content of a CSV file named users.csv. The code uses the OpenCSV library to read each row from the file and print its content along with the row number.

Your task is to complete the missing parts of the code where indicated by // Write your code here.

 **File Path:** 
You can use any of the below file path as a reference:

- users.csv
- /home/chef/workspace/users.csv

 **You can see the content of users.csv file** 

 **Steps to Follow:** 

Step 1: Create a `FileReader` object for the given file path

```
FileReader fileReader = new FileReader(filePath);

```

Step 2: Pass the `fileReader` to `CSVReader`

```
CSVReader csvReader = new CSVReader(fileReader);

```

Step 3: Read the first row from the file into a `String[]` array

```
String[] row = csvReader.readNext();

```

Step 6: Inside the loop, read the next row again

```
row = csvReader.readNext();

```

 **Output** 

```
Row 0: Name Age Email 
Row 1: John 30 john@example.com 
Row 2: Jane 25 jane@example.com 

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:30:16.420Z  

```cpp

            // Step 3: Read the first row of the CSV file and store it in a String array
            String[] row = csvReader.readNext();
            // Step 2: Wrap FileReader with CSVReader from OpenCSV
            CSVReader csvReader = new CSVReader(fileReader);


public class Codechef {
    // Static file path to the CSV file you want to read (change as needed)
    public static String filePath = "/home/chef/workspace/users.csv";

    public static void main(String[] args) {
        try {
            // Step 1: Create a FileReader to read the CSV file
            FileReader fileReader = new FileReader(filePath);

import com.opencsv.CSVReader;
import java.io.FileReader;
            int rowNum = 0;

            // Step 4: Loop through each row until null (end of file)
            while (row != null) {
                // Step 5: Print row number and values
                System.out.print("Row " + rowNum + ": ");
                for (int i = 0; i < row.length; i++) {
                    System.out.print(row[i] + " ");
                }
                System.out.println();
```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM03)