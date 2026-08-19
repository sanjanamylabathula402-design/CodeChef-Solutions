
            // Step 5: Close the writer
            fileWriter.close();

            System.out.println("JSON data saved to file successfully!");

        } catch (Exception e) {
            System.out.println("Error writing to the JSON file.");
            e.printStackTrace();
        }
    }
}
