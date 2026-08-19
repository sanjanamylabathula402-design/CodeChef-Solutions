# QZPBKM11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reading Weather Forecast Data from a JSON File

You are given a partial Java program that reads and prints the contents of a JSON file named `forecast.json`. The code uses Java's `Files.readString` and `org.json.JSONObject` to read the file and print each key-value pair present in the JSON object.

Your task is to complete the missing parts of the code where indicated by `// Write your code here`.

 **File Path:** 

- forecast.json

 **You can checkout the content present in `forecast.json`.** 

 **Steps to Follow:** 

Step 1: Read the JSON file content into a string
Step 2: Convert the content string into a `JSONObject`
Step 3: Loop through the keys of the JSON object using a `for` loop
Step 4: Print the key-value pairs

 **Expected Output** 

```
condition = Clear Skies
city = New Delhi
temperature = 25C

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:34:50.601Z  

```cpp
            // Step 3: Use a traditional for loop to iterate through keys
            for (int i = 0; i < obj.length(); i++) {
                String key = obj.names().getString(i);  // Get key by index
                System.out.println(key + " = " + obj.get(key));  // Print key-value pair
            }

        } catch (Exception e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM11)