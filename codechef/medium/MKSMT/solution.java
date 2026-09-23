import java.io.InputStream;
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
            long maxVal = 0;
            boolean isSorted = true;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                if (a[i] > maxVal) maxVal = a[i];
                if (i > 0 && a[i - 1] > a[i]) {
                    isSorted = false;
                }
            }

            if (isSorted) {
                output.append("-1\n");
                continue;
            }

            // Binary search for maximum valid X
            long low = 1, high = maxVal;
            long ans = -1;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                if (canSortWithX(a, n, mid)) {
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

    private static boolean canSortWithX(long[] a, int n, long x) {
        int firstGt = -1, lastGt = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > x) {
                if (firstGt == -1) firstGt = i;
                lastGt = i;
            }
        }

        // If no element is > x, any interval containing inversions works
        int l = (firstGt != -1) ? firstGt : 0;
        int r = (lastGt != -1) ? lastGt : n - 1;

        // Expand L and R to cover any prefix/suffix inversions outside [L, R]
        for (int i = 0; i < l; i++) {
            if (i > 0 && a[i - 1] > a[i]) {
                l = 0;
                break;
            }
        }
        for (int i = r + 1; i < n; i++) {
            if (i > 0 && a[i - 1] > a[i]) {
                r = n - 1;
                break;
            }
        }

        // Simulate smoothing on a[L..R]
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

        // Check if smoothed segment is sorted internally
        for (int i = 0; i < m - 1; i++) {
            if (b[i] > b[i + 1]) return false;
        }

        // Check boundary condition with left neighbour
        if (l > 0 && b[0] < a[l - 1]) return false;

        // Check boundary condition with right neighbour
        if (r < n - 1 && b[m - 1] > a[r + 1]) return false;

        return true;
    }

    static class FastScanner {
        private final InputStream stream;
        private final byte[] buffer = new byte[1024 * 32];
        private int head = 0;
        private int tail = 0;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (tail == -1) throw new InputMismatchException();
            if (head >= tail) {
                head = 0;
                try {
                    tail = stream.read(buffer, 0, buffer.length);
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
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
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
                if (c < '0' || c > '9') throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = read();
            } while (c > ' ');
            return res * sgn;
        }
    }
}
