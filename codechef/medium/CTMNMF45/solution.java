import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int limit = scanner.nextInt(); 
        int sum = 0; 
        int num = 1;
        while (num <= limit) {
            if (num % 10 == 5) { 
                num++; 
                continue; 
            }
            sum += (num * num); 
            num++; 
        }
        System.out.println("Sum of squares (excluding numbers ending with 5): " + sum);
        scanner.close(); 
    }
}
