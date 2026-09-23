import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        StringBuilder sb = new StringBuilder();
        
        if (!sc.hasNext()) return;
        int T = sc.nextInt();
        
        while (T-- > 0) {
            long N = sc.nextLong();
            long A = sc.nextLong();
            long B = sc.nextLong();
            long C = sc.nextLong();
            
            // Case 1: Z = 1 (k = 0) -> Y = N, X = 1
            long minCost = A + B * N + C;
            
            // Case 2: Z >= 2 (k = Z - 1 >= 1)
            // We iterate over k = 1 to N
            for (long k = 1; k <= N; k++) {
                // We want to test key values of X for a given k:
                // 1) X = 1 (minimal X)
                // 2) X such that k * X + X >= N  =>  X = ceil(N / (k + 1))
                
                // Option A: X = 1
                long X1 = 1;
                long Y1 = Math.max(X1, N - k * X1);
                long cost1 = A * X1 + B * Y1 + C * (k + 1);
                if (cost1 < minCost) {
                    minCost = cost1;
                }
                
                // Option B: X = ceil(N / (k + 1)), where Y = X
                long X2 = (N + k) / (k + 1); // equivalent to ceil(N / (k + 1))
                if (X2 >= 1) {
                    long Y2 = Math.max(X2, N - k * X2);
                    long cost2 = A * X2 + B * Y2 + C * (k + 1);
                    if (cost2 < minCost) {
                        minCost = cost2;
                    }
                }
                
                // Early break optimization when C * k exceeds current minCost
                if (C * (k + 1) >= minCost) {
                    break;
                }
            }
            
            sb.append(minCost).append("\n");
        }
        
        System.out.print(sb);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024 * 64];
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
            return hasNextByte() ? buffer[ptr++] : -1;
        }

        public boolean hasNext() {
            while (hasNextByte() && buffer[ptr] <= ' ') ptr++;
            return hasNextByte();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (b >= '0' && b <= '9') {
                n = n * 10 + (b - '0');
                b = readByte();
            }
            return minus ? -n : n;
        }

        public int nextInt() {
            return (int) nextLong();
        }
    }
}