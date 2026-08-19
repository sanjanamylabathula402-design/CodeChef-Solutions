import java.io.FileWriter;
import java.io.IOException;

class Codechef
{
    public static void addLinesToFile(String filepath, String lineOne, String lineTwo){
        try {
            // Create a FileWriter in append mode
            FileWriter writer = new FileWriter(filepath, true);

            // Append text to the file with line breaks
            writer.write(lineOne + "\n");
            writer.write(lineTwo + "\n");

            // Close the writer to save changes
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred");