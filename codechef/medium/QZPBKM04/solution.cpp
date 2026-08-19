            csvReader.close();

            // Print the total number of rows
            System.out.println("Total number of rows: " + (rowCount-1));

        } catch (Exception e) {
            // Step 7: Handle exceptions such as file not found or read error
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}
