import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();  
        int end = scanner.nextInt();  
        int limit = scanner.nextInt(); 
        while (start <= end) {
            if (start % 2 != 0) { 
                System.out.println("Addition Table for " + start + ":");
                int addend = 1;
                while (addend <= limit) {
                    System.out.println(start + " + " + addend + " = " + (start + addend));
                    addend++; 
                }
            }
            start++; 
        }
        scanner.close();
    }
}
