# QZPBKM07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Writing User Login Details from a CSV File

You are given a partial Java program that writes data into a CSV file named `users.csv`. The code uses the OpenCSV library to write data into the CSV file.

Your task is to complete the missing parts of the code where indicated by // Write your code here.

 **File Path:** 
You can use any of the below file path as a reference:

- users.csv
- /home/chef/workspace/users.csv

 **Steps to Follow:** 

 **Step 1:**  Create a `FileWriter` object for the given file path

```
FileWriter fileWriter = new FileWriter(filePath);

```

 **Step 2:**  Pass the `fileWriter` to `CSVWriter`

```
CSVWriter csvWriter = new CSVWriter(fileWriter);

```

 **Step 3:**  Write the header row using `csvWriter.writeNext()`
 **Step 4:**  Write the data rows using `csvWriter.writeNext()`
 **Step 5:**  Close the `CSVWriter`

```
csvWriter.close();

```

 **Don't forget to see the changes in users.csv file as you run the code.**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:32:55.704Z  

```cpp
            String[] header = {"Name", "Age", "Email"};
            csvWriter.writeNext(header);

            // Step 4: Write data rows to the CSV file
            String[] row1 = {"John", "30", "john@example.com"};
            String[] row2 = {"Jane", "25", "jane@example.com"};
            String[] row3 = {"Alice", "28", "alice@example.com"};

            csvWriter.writeNext(row1);
            csvWriter.writeNext(row2);
            csvWriter.writeNext(row3);

            // Step 5: Close the CSVWriter to save and free resources
            csvWriter.close();

        } catch (Exception e) {
            // Step 6: Handle exceptions such as file write error
            System.out.println("Error writing CSV file");
```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM07)