import org.json.JSONObject;
import java.io.FileWriter;

public class Codechef {

    // Step 1: Path to the JSON file
    public static String filePath = "student.json";
    public static void main(String[] args) {
        try {
            // Step 2: FileWriter to write to the file
            FileWriter fileWriter = new FileWriter(filePath);

            // Step 3: Create JSONObject(s) for data
            JSONObject json1 = new JSONObject();
            json1.put("name", "Alice");
            json1.put("age", 25);
            json1.put("city", "Bangalore");
