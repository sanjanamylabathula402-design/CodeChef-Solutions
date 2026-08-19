# QZPBKM08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Write Filtered CSV File

You are given a partial code that writes filtered data to a CSV file using the OpenCSV library. Your task is to complete the code so that it writes a CSV file containing only the rows where the age is greater than 30.

The given partial code already includes the creation of a CSVWriter, the header row, and the initial data rows. You need to complete the steps that write the filtered rows and handle the file creation.

 **Steps to Follow** 

- Step 1: Create a FileWriter to write to the specified file path (filePath). You will need to initialize a FileWriter with the path specified in the filePath variable.
- Step 2: Wrap the FileWriter with CSVWriter from the OpenCSV library. Use the CSVWriter class to write to the file. It will take the FileWriter object as a parameter.
- Step 3: Write the header row to the CSV file. The header row should be written first with the following column names: Name, Age, and Email.
- Step 4: Filter and write rows where the age is greater than 30. For each row, check the age (the second element in the array). If the age is greater than 30, write the row to the CSV file.
- Step 5: Close the CSVWriter to save and free resources. After writing all the required rows, close the CSVWriter to ensure that the data is saved and the resources are released.

 **Expected Output:** 

```
Name,Age,Email
Bob,35,bob@example.com
Charlie,40,charlie@example.com

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:33:51.973Z  

```cpp
                csvWriter.writeNext(row5);
            }

            // Step 6: Close the CSVWriter
            csvWriter.close();

            System.out.println("Filtered CSV file written successfully.");
        } catch (Exception e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM08)