import com.opencsv.CSVReader;
import java.io.FileReader;

public class Codechef {
    public static String filePath = "/home/chef/workspace/Employees.csv"; 

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(filePath);
            CSVReader csvReader = new CSVReader(fileReader);

            String[] row = csvReader.readNext();
            int rowNum = 0;

            while (row != null) {
                System.out.print("Row " + rowNum + ": ");
                for (int i = 0; i < row.length; i++) {
                    System.out.print(row[i] + " ");