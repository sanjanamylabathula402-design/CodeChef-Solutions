import java.io.*;

public class Main {
    static final int MOD = 998244353;

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            // Read Q (identity permutation, included to consume input)
            for (int i = 0; i < n; i++) {
                sc.nextInt();
            }

            // Calculate K^(N - K + 1) % MOD
            long ans = power(k, n - k + 1, MOD);

            // Multiply by (K - 1)! % MOD
            for (int i = 1; i <= k - 1; i++) {
                ans = (ans * i) % MOD;
            }

            out.println(ans);
        }

        out.flush();
    }

    private static long power(long base, long exp, int mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            ptr = 0;
            try {
                buflen = in.read(buffer, 0, buffer.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return buflen > 0;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        public int nextInt() {
            int b = readByte();
            while (b <= 32) {
                if (b == -1) return -1;
                b = readByte();
            }
            int sgn = 1;
            if (b == '-') {
                sgn = -1;
                b = readByte();
            }
            int res = 0;
            while (b >= '0' && b <= '9') {
                res = res * 10 + b - '0';
                b = readByte();
            }
            return res * sgn;
        }
    }
}