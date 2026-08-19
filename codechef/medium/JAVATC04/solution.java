import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int num = Integer.parseInt(scanner.nextLine());  // Attempt to convert input to an integer
            System.out.println(num);
        } catch (NumberFormatException e) {  // Handle cases where input is not a valid integer
            System.out.println("Invalid Integer");
        }

        scanner.close();
    }
}
