import com.opencsv.CSVWriter;
import java.io.FileWriter;

public class Codechef {
    public static String filePath = "/home/chef/workspace/Employees.csv"; 

    public static void main(String[] args) {
        try {
            // Step 1: Create a FileWriter to write to the file
            FileWriter fileWriter = new FileWriter(filePath);

            // Step 2: Wrap FileWriter with CSVWriter from OpenCSV
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            // Step 3: Write header row
            String[] header = { "Name", "Designation", "Salary" };
            csvWriter.writeNext(header);
