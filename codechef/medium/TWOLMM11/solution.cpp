import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

class Codechef
{
    public static String readFile(String filepath){
        try {
            // Read the entire file content as a String
            String content = Files.readString(Paths.get(filepath));
            return content;  // Return the content
        } catch (IOException e) {
            return "Error reading file: " + e.getMessage();  // Handle file read errors
        }
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {