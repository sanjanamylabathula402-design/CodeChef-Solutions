import java.util.Scanner;

 class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Take user input
            String userInput = scanner.nextLine();

            // Try converting to float
            float result1 = Float.parseFloat(userInput);

            // Try converting null to float (this will cause NullPointerException)
            String nullValue = null;
            float result2 = Float.parseFloat(nullValue);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (NullPointerException e) {
            System.out.println("Please enter a string or numeric value");
        }

        scanner.close();
    }
}
