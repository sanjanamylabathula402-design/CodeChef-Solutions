import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                int num = i + j; 
                if (num % 2 == 0) {
                    System.out.print("EVEN  ");
                } else {
                    System.out.print(num + "   ");
                }
            }
            System.out.println(); 
        }
    }
}
