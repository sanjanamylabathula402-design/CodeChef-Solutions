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