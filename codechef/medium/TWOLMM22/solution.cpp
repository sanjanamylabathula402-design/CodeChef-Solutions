import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class Codechef
{
    public static void writeToFile(String filepath, String content){
        try {
            // Create a FileWriter object for writing to a file
            FileWriter writer = new FileWriter(filepath);

            // Write text to the file
            writer.write(content);

            // Close the writer to save changes
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");