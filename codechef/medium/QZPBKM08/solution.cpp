                csvWriter.writeNext(row5);
            }

            // Step 6: Close the CSVWriter
            csvWriter.close();

            System.out.println("Filtered CSV file written successfully.");
        } catch (Exception e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}
