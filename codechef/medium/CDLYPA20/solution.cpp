import java.io.File;

class Codechef {
    // Function definition: checks if a file exists with exception handling
    public static boolean isFileExists(String filePath1, String filePath2) {
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);

        return file1.exists() || file2.exists();
    }

    public static void main(String[] args) {
        // File path to check
        String filePath1 = "/home/chef/workspace/sample.txt";
        String filePath2 = "/home/chef/workspace/sample1.txt";

        // Function call
        System.out.println(isFileExists(filePath1, filePath2));