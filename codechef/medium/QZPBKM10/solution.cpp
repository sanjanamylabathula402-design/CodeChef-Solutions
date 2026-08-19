import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Codechef {
    public static String filePath = "customer.json"; 

    public static void main(String[] args) {
        try {
            // Step 1: Read entire file as a String
            String content = Files.readString(Paths.get(filePath));

            // Step 2: Convert String to JSONObject
            JSONObject obj = new JSONObject(content);

            // Step 3: Use a traditional for loop to iterate through keys
            for (int i = 0; i < obj.length(); i++) {
                String key = obj.names().getString(i);  // Get key by index