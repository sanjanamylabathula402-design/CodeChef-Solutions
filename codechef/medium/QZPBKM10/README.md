# QZPBKM10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Print Key-Value Pairs from JSON
- In this example, we read a JSON file using Files.readString() to load the content into a single String, and then use the JSONObject class from the org.json library to parse and extract key-value pairs.
- We use a traditional for loop to iterate through the keys of the JSONObject. The method obj.names().getString(i) is used to retrieve each key by its index. The corresponding value is accessed using obj.get(key).
- Each key-value pair is printed in the format: key = value

The `JSONObject` class allows you to access values using methods like `get()`, `getString()`, or `getInt()` by providing the key name.

 **Steps Performed:** 

- Read the entire JSON file as a String using Files.readString().
- Parse the String into a JSONObject.
- Use obj.names().getString(i) to retrieve each key by index in a loop.
- Use obj.get(key) to extract the corresponding value.
- Print each key-value pair in the format key = value.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:34:16.552Z  

```cpp
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Codechef {
    public static String filePath = "customer.json"; 

    public static void main(String[] args) {
        try {
            // Step 1: Read entire file as a String
            String content = Files.readString(Paths.get(filePath));

            // Step 2: Convert String to JSONObject
            JSONObject obj = new JSONObject(content);

            // Step 3: Use a traditional for loop to iterate through keys
            for (int i = 0; i < obj.length(); i++) {
                String key = obj.names().getString(i);  // Get key by index
```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM10)