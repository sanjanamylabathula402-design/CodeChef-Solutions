import java.io.InputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.TreeSet;

public class Main {
    private static final int MOD = 998244353;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] Q = new int[N];
            for (int i = 0; i < N; i++) {
                Q[i] = sc.nextInt();
            }

            // 1. Verify that the last K-1 elements are strictly sorted
            boolean valid = true;
            for (int i = N - K + 1; i < N - 1; i++) {
                if (Q[i] > Q[i + 1]) {
                    valid = false;
                    break;
                }
            }

            if (!valid) {
                sb.append(0).append("\n");
                continue;
            }

            // 2. Process windows right-to-left to count choices and check feasibility
            TreeSet<Integer> window = new TreeSet<>();
            for (int i = N - K + 1; i < N; i++) {
                window.add(Q[i]);
            }

            long ans = 1;
            for (int i = N - K; i >= 0; i--) {
                window.add(Q[i]);

                // Count elements in the active window that are >= Q[i]
                int choices = window.tailSet(Q[i], true).size();
                
                // If Q[i] is greater than the smallest element in the window 
                // that was carried over, Q is unachievable
                if (window.first() < Q[i]) {
                    valid = false;
                    break;
                }

                ans = (ans * choices) % MOD;

                // Keep the window size at K-1 for the previous step
                if (window.size() == K) {
                    window.pollLast(); // Remove the largest element pushed right
                }
            }

            if (!valid) {
                sb.append(0).append("\n");
            } else {
                sb.append(ans).append("\n");
            }
        }

        System.out.print(sb);
    }

    // Fast I/O Scanner
    static class FastScanner {
        private final InputStream is = System.in;
        private final byte[] buffer = new byte[1024 * 64];
        private int head = 0;
        private int tail = 0;

        private int read() {
            if (head >= tail) {
                head = 0;
                try {
                    tail = is.read(buffer, 0, buffer.length);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (tail <= 0) return -1;
            }
            return buffer[head++];
        }

        public int nextInt() {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return -1;
                c = read();
            }
            int res = 0;
            while (c >= '0' && c <= '9') {
                res = res * 10 + c - '0';
                c = read();
            }
            return res;
        }
    }
}