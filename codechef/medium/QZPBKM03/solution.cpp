
            // Step 3: Read the first row of the CSV file and store it in a String array
            String[] row = csvReader.readNext();
            // Step 2: Wrap FileReader with CSVReader from OpenCSV
            CSVReader csvReader = new CSVReader(fileReader);


public class Codechef {
    // Static file path to the CSV file you want to read (change as needed)
    public static String filePath = "/home/chef/workspace/users.csv";

    public static void main(String[] args) {
        try {
            // Step 1: Create a FileReader to read the CSV file
            FileReader fileReader = new FileReader(filePath);

import com.opencsv.CSVReader;
import java.io.FileReader;
            int rowNum = 0;

            // Step 4: Loop through each row until null (end of file)
            while (row != null) {
                // Step 5: Print row number and values
                System.out.print("Row " + rowNum + ": ");
                for (int i = 0; i < row.length; i++) {
                    System.out.print(row[i] + " ");
                }
                System.out.println();