import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {  
            for (int j = 1; j <= size; j++) {  
                if (i == j) {
                    System.out.print(" - ");
                    continue; 
                }
                System.out.print(" " + (j) + " "); // Print column number
            }
            System.out.println();
        }

        System.out.println("Matrix with non-equal pairs completed.");
    }
}
