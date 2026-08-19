import java.io.File;

class Codechef {
    // Define a function to check file existence
    public static boolean doesFileExist(String filepath) {
        File file = new File(filepath);
        return file.exists(); // Returns true if the file exists
    }

    public static void main(String[] args) {
        String filepath1 = "/home/chef/workspace/Existence.txt"; 
        String filepath2 = "/home/chef/workspace/temp.txt"; 

        // Call the function to check file existence
        if (doesFileExist(filepath1)) {
            System.out.println("The file '" + filepath1 + "' exists.");
        } else {
            System.out.println("The file '" + filepath1 + "' does not exist.");