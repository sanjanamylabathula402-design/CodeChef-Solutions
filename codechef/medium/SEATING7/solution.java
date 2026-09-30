import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            
            boolean[] occupied = new boolean[N + 1];
            for (int i = 0; i < M; i++) {
                occupied[sc.nextInt()] = true;
            }
            
            StringBuilder sb = new StringBuilder();
            int currentSeat = 1;
            int found = 0;
            
            while (found < K && currentSeat <= N) {
                if (!occupied[currentSeat]) {
                    sb.append(currentSeat).append(" ");
                    found++;
                }
                currentSeat++;
            }
            
            System.out.println(sb.toString().trim());
        }
    }
}