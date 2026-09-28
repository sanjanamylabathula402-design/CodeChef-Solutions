import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long min = Long.MAX_VALUE;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            long h = sc.nextLong();
            sum += h;
            min = Math.min(min, h);
        }

        long answer = sum - (min * N);

        System.out.println(answer);
    }
}