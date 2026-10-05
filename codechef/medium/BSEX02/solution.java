import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            n= n*(n+1)/2;
            System.out.println(n);
        }
    }
}
