import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int multipleOf = sc.nextInt();
         
        // For loop with range from 1 to 10
        for (int i = 1; i <= 10; i++) { 
            
            if (i % multipleOf == 0) { 
                System.out.println(i);
            }
        }
        sc.close();
    }
}
