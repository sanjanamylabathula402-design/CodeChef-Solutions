import java.util.Scanner;

 class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();

        // Perform division with error handling
        
        try {
            int result = numerator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division not allowed.");
        }

        scanner.close();
    }
}
