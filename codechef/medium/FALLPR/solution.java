import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        
        if (!sc.hasNext()) return;
        int t = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // Compute prefix sums
            long[] pref = new long[n];
            pref[0] = a[0];
            for (int i = 1; i < n; i++) {
                pref[i] = pref[i - 1] + a[i];
            }

            // Find first index where prefix sum becomes negative
            int firstNeg = -1;
            for (int i = 0; i < n; i++) {
                if (pref[i] < 0) {
                    firstNeg = i;
                    break;
                }
            }

            // If no negative prefix sum exists, the array is already good
            if (firstNeg == -1) {
                sb.append("YES\n");
                continue;
            }

            // Compute suffix minimums of prefix sums
            long[] sufMin = new long[n];
            sufMin[n - 1] = pref[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                sufMin[i] = Math.min(pref[i], sufMin[i + 1]);
            }

            // Check if deleting element at index k (0 <= k <= firstNeg) works
            boolean possible = false;
            for (int k = 0; k <= firstNeg; k++) {
                if (a[k] <= sufMin[k]) {
                    possible = true;
                    break;
                }
            }

            if (possible) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        
        System.out.print(sb);
    }

    // Fast I/O class for performance with large inputs (sum of N up to 2*10^5)
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        boolean hasNext() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return false;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return false;
                }
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}