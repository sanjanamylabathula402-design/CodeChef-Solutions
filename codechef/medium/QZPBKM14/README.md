# QZPBKM14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Write Student Data to JSON File

In this example, we write structured data to a  **JSON file**  using  **Java’s `FileWriter`**  along with the  **`org.json` library**. This approach ensures that the JSON content is formatted correctly, making it easy to read and parse.

 **File Path** 

`student.json`

 **After writing, you can open the `student.json` file and see its contents in JSON format.** 

 **What’s Happening Here?** 

- FileWriter opens a new file (or overwrites an existing one) for writing text.
- JSONObject (from the org.json library) is used to represent structured JSON data, where you add key-value pairs to form the content.
- We write individual JSON objects to the file, each containing details like name, age, and city.
- The JSON content is formatted with pretty-printing (4-space indentation) to make it human-readable.
- This is much safer and easier than manually building the JSON string or handling special characters and formatting.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:36:10.386Z  

```cpp
import org.json.JSONObject;
import java.io.FileWriter;

public class Codechef {

    // Step 1: Path to the JSON file
    public static String filePath = "student.json";
    public static void main(String[] args) {
        try {
            // Step 2: FileWriter to write to the file
            FileWriter fileWriter = new FileWriter(filePath);

            // Step 3: Create JSONObject(s) for data
            JSONObject json1 = new JSONObject();
            json1.put("name", "Alice");
            json1.put("age", 25);
            json1.put("city", "Bangalore");

```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM14)