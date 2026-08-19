# QZPBKM12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reading Product Data from a JSON File

In this task, you need to read a JSON file and extract the value of a specific field named `category`. The file may contain multiple key-value pairs.

 **You can checkout the content present in `product.json`** 

 **Steps to Follow** 

- Read the entire file as a String Use Files.readString(Paths.get("product.json")) to load the content.
- Convert the content to a JSON object Use new JSONObject(content) to parse the string into a JSONObject.
- Extract the required field Use obj.getString("category") to retrieve and print the value of the category field.
- Handle exceptions If any error occurs during reading or parsing, print the message: Error reading file

 **Expected Output** 

```
Electronics

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:35:17.713Z  

```cpp
                               .replace("}", "")
                               .replace(",", "")
                               .replace("\"", "");

                    // Split into key and value
                    String[] parts = line.split(":");

                    if (parts[0].trim().equals("category")){
                        System.out.println(parts[1].trim());
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading file");
        }
    }

```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM12)