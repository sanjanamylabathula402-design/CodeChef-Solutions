import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();
        
        // Validate that start is less than end
        while (start >= end) {
            System.out.println("Invalid input! Start value must be less than end value.");
        }

        // Loop starting from 1001, incrementing by 3 each time
        for (int i = start; i <= end; i += step) {  
            
            // Check if the number is divisible by both 7 and 14
            if (i % 7 == 0 && i % 14 == 0) {  
                System.out.println(i);  
                break; // Exit the loop immediately after finding the number
            }
        }
    }
}
