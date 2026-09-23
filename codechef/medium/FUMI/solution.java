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
            
            // Case Z = 1 (k = 0): X = 1, Y = N
            long minCost = A + B * N + C;
            
            // Case Z >= 2 (k = Z - 1 >= 1)
            for (long k = 1; k <= N; k++) {
                long baseCostC = C * (k + 1);
                if (baseCostC >= minCost) {
                    break;
                }
                
                // Threshold where Y = X
                long X_boundary = (N + k) / (k + 1); // ceil(N / (k + 1))
                
                // Candidate 1: X = X_boundary (Y = X)
                {
                    long X = X_boundary;
                    long Y = X;
                    long cost = A * X + B * Y + baseCostC;
                    if (cost < minCost) minCost = cost;
                }
                
                // Candidate 2: X = 1 (minimal X when Y > X)
                {
                    long X = 1;
                    long Y = Math.max(X, N - k * X);
                    long cost = A * X + B * Y + baseCostC;
                    if (cost < minCost) minCost = cost;
                }
                
                // Candidate 3: X = X_boundary - 1 (maximal X before Y = X, useful when A - B * k < 0)
                if (X_boundary - 1 >= 1) {
                    long X = X_boundary - 1;
                    long Y = N - k * X;
                    long cost = A * X + B * Y + baseCostC;
                    if (cost < minCost) minCost = cost;
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