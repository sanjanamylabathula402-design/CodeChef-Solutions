import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        StringBuilder sb = new StringBuilder();
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // Step 1: Check if the array is already sorted
            boolean isSorted = true;
            int firstInv = -1, lastInv = -1;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;
                    if (firstInv == -1) firstInv = i;
                    lastInv = i;
                }
            }

            if (isSorted) {
                sb.append("-1\n");
                continue;
            }

            // Step 2: Identify minimal bounds [L, R] covering all inverted pairs
            int L = firstInv;
            int R = lastInv + 1;

            long upperX = (R + 1 < n) ? a[R + 1] : (long) 1e18;
            long lowerX = (L > 0) ? a[L - 1] : 0;

            // Step 3: Binary search for the maximum valid X in [lowerX, upperX]
            long ans = -1;
            long low = lowerX, high = upperX;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                if (isValid(a, n, L, R, mid)) {
                    ans = mid;
                    low = mid + 1; // Try to find a larger X
                } else {
                    high = mid - 1;
                }
            }

            sb.append(ans).append("\n");
        }
        
        System.out.print(sb);
    }

    // Helper method to simulate smoothing on subarray a[L...R] with threshold X
    private static boolean isValid(long[] a, int n, int L, int R, long X) {
        long S = 0;
        long[] b = a.clone();

        for (int i = L; i <= R; i++) {
            if (b[i] >= X) {
                S += (b[i] - X);
                b[i] = X;
            } else {
                long add = Math.min(S, X - b[i]);
                b[i] += add;
                S -= add;
            }
        }

        // Verify if the whole array becomes sorted
        for (int i = 0; i < n - 1; i++) {
            if (b[i] > b[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Fast I/O Class for efficiency
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
