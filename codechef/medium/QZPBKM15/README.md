# QZPBKM15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Writing Product Details to a JSON File

You are given a partial Java program that writes data into a JSON file named `product.json`. The code uses the `org.json` library to write a JSON object into the file.

Your task is to complete the missing parts of the code where indicated by `// Write your code here`.

 **File Path:** 

- product.json

 **Steps to Follow:** 

 **Step 1:**  Create a `JSONObject` for the product data

```
JSONObject product = new JSONObject();
product.put("id", 1);
product.put("name", "Laptop");
product.put("price", 1200.99);
product.put("category", "Electronics");

```

 **Step 2:**  Create a `FileWriter` object for the given file path

```
FileWriter fileWriter = new FileWriter(filePath);

```

 **Step 3:**  Write the JSON object to the file using `fileWriter`

```
fileWriter.write(product.toString(4));  // Write JSON with pretty print (4 spaces indentation)

```

 **Step 4:**  Handle any `IOException` that might occur during the write operation

```
} catch (IOException e) {
    System.out.println("Error writing to the JSON file.");
    e.printStackTrace();
}

```

 **Step 5:**  Close the `FileWriter` to ensure resources are released

```
fileWriter.close();

```

 **Don't forget to see the changes in `product.json` file as you run the code.**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:36:43.167Z  

```cpp

            // Step 5: Close the writer
            fileWriter.close();

            System.out.println("JSON data saved to file successfully!");

        } catch (Exception e) {
            System.out.println("Error writing to the JSON file.");
            e.printStackTrace();
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM15)