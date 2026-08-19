# QZPBKM16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Writing Weather Data to a JSON File

In this task, you need to create a `JSONObject` with weather data and save it to a file using the `org.json` library. The file `weather.json` will store details like temperature, humidity, and condition.

 **Steps to Follow** 

- Create a JSONObject with weather information Use new JSONObject() and the put() method to add temperature, humidity, and condition.
- Write the JSON object to a file Use FileWriter and write() method to save the pretty-printed JSON to "weather.json".
- Print success message After writing is complete, display: Weather data saved to JSON file successfully!
- Handle exceptions If any error occurs during the writing process, print: Error writing to the JSON file: <error message>

 **Expected weather.json file** 

```
{
    "condition": "Cloudy",
    "temperature": 28,
    "humidity": 65
}

```

 **Don't forget to see the changes as you run the code**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:37:14.131Z  

```cpp
        try {
            // Step 1: Create a JSONObject with weather details
            JSONObject weather = new JSONObject();
            weather.put("temperature", 28);
            weather.put("humidity", 65);
            weather.put("condition", "Cloudy");

            // Step 2: Write the JSONObject to the file
            FileWriter fileWriter = new FileWriter("weather.json");
            fileWriter.write(weather.toString(4)); // Pretty print with 4-space indentation

            // Step 3: Close the file writer
            fileWriter.close();

            // Step 4: Print success message
            System.out.println("Weather data saved to JSON file successfully!");

        } catch (Exception e) {
```

---

[View on CodeChef](https://www.codechef.com/problems/QZPBKM16)