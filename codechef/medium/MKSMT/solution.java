import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        StringBuilder output = new StringBuilder();
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }

            // Step 1: Check if the array is already sorted
            boolean isSorted = true;
            int firstInv = -1;
            int lastInv = -1;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;
                    if (firstInv == -1) {
                        firstInv = i;
                    }
                    lastInv = i;
                }
            }

            if (isSorted) {
                output.append("-1\n");
                continue;
            }

            // Subarray L..R must cover all inversions
            int l = firstInv;
            int r = lastInv + 1;

            // Binary search for max X
            long low = 1;
            long high = 1_000_000_000L;
            long ans = -1;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                if (check(a, l, r, mid)) {
                    ans = mid;
                    low = mid + 1; // Try to find a larger X
                } else {
                    high = mid - 1;
                }
            }

            output.append(ans).append("\n");
        }

        System.out.print(output);
    }

    // Helper function to check if smoothing A[L..R] with X results in a sorted array
    private static boolean check(long[] a, int l, int r, long x) {
        int m = r - l + 1;
        long[] b = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = a[l + i];
        }

        long s = 0;
        for (int i = 0; i < m; i++) {
            if (b[i] >= x) {
                s += (b[i] - x);
                b[i] = x;
            } else {
                long add = Math.min(s, x - b[i]);
                b[i] += add;
                s -= add;
            }
        }

        // Check non-decreasing condition within the smoothed subarray
        for (int i = 0; i < m - 1; i++) {
            if (b[i] > b[i + 1]) {
                return false;
            }
        }

        // Check left boundary
        if (l > 0 && b[0] < a[l - 1]) {
            return false;
        }

        // Check right boundary
        if (r < a.length - 1 && b[m - 1] > a[r + 1]) {
            return false;
        }

        return true;
    }

    // Fast I/O reader for Java
    static class FastScanner {
        private final InputStream stream;
        private final byte[] buffer = new byte[1024 * 32];
        private int head = 0;
        private int tail = 0;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (tail == -1) {
                throw new InputMismatchException();
            }
            if (head >= tail) {
                head = 0;
                try {
                    tail = stream.read(buffer, 0, buffer.length);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (tail <= 0) {
                    return -1;
                }
            }
            return buffer[head++];
        }

        public int nextInt() {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return -1;
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = read();
            } while (c > ' ');
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return -1;
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = read();
            } while (c > ' ');
            return res * sgn;
        }
    }
}
