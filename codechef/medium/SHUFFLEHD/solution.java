import java.io.InputStream;
import java.io.IOException;
import java.util.InputMismatchException;

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

            // Check if the suffix of size K-1 is sorted
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

            // Count valid permutations P
            long ans = 1;
            for (int i = 0; i <= N - K; i++) {
                int count = 1; // Q[i] itself
                for (int j = 1; j < K; j++) {
                    if (Q[i] < Q[i + j]) {
                        count++;
                    }
                }
                ans = (ans * count) % MOD;
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }

    // Fast IO Scanner for large input sets
    static class FastScanner {
        private final InputStream is = System.in;
        private final byte[] buffer = new byte[1024 * 32];
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