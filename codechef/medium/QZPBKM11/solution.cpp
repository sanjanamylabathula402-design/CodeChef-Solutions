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
