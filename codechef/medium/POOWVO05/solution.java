import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int number; 
        while (true) {
            number = scanner.nextInt(); 
            if (number % 3 == 0 && number % 5 == 0) {
                break; 
            } else {
                System.out.println("Invalid input! Enter a number divisible by both 3 and 5."); 
            }
        }
        System.out.println("Valid input! " + number + " is divisible by both 3 and 5.");
        
        scanner.close(); 
    }
}