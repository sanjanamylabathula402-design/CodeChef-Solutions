# CDLYPA19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### File Existence Check with File Size
- In Java, we can read JSON files manually by reading the entire file as a String, then parsing it using the org.json library.
- This method is best suited for flat JSON objects (non-nested), and does not require loops for simple key-value access.
- For complex or nested JSON files, we can use more advanced parsing with JSONObject and JSONArray.

 **Sample `data.json` File** 

```
{
  "name": "Alice",
  "age": 30,
  "department": "HR"
}

```

 **Example Code** 

```
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReaderExample {
    public static void main(String[] args) {
        try {
            // Step 1: Read entire file as a String
            String content = Files.readString(Paths.get("data.json"));

            // Step 2: Convert String to JSONObject
            JSONObject obj = new JSONObject(content);

            // Step 3: Use getString() or getInt() to fetch values by key
            System.out.println("name = " + obj.getString("name"));         // string value
            System.out.println("age = " + obj.getInt("age"));              // integer value
            System.out.println("department = " + obj.getString("department")); // string value

        } catch (Exception e) {
            System.out.println("Something went wrong while reading the file.");
            e.printStackTrace();
        }
    }
}

```

 **Output** 

```
name = Alice
age = 30
department = HR

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:01:49.450Z  

```cpp
        return file.exists();

    }

    public static void main(String[] args) {
        String filepath1 = "/home/chef/workspace/size.txt";
        String filepath2 = "/home/chef/workspace/size2.txt";

        // Call the function to check file existence and size
        System.out.println(checkExistance(filepath1));
        System.out.println(checkExistance(filepath2));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CDLYPA19)