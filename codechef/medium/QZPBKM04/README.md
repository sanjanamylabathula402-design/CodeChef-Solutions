# QZPBKM04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Count CSV Rows

You are tasked with reading a CSV file and counting the total number of rows in the file. The CSV file contains multiple rows and columns of data. You will use OpenCSV library to read and process the file. The program should print the total number of rows  **excluding header**.

 **Steps to Follow** 

- Create a FileReader object to read the CSV file using the given filePath.
- Create a CSVReader object by wrapping the FileReader.
- Inside the loop, increment the rowCount variable for each non-null row.
- After the loop, print the total number of rows(excluding header).

 **Expected Output** 

```
Total number of rows: 3

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:31:06.030Z  

```cpp
            csvReader.close();

            // Print the total number of rows
            System.out.println("Total number of rows: " + (rowCount-1));

        } catch (Exception e) {
            // Step 7: Handle exceptions such as file not found or read error
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM04)