import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);

        if (!st.hasMoreTokens()) return;
        int T = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] C = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                while (st == null || !st.hasMoreTokens()) {
                    line = br.readLine();
                    if (line == null) break;
                    st = new StringTokenizer(line);
                }
                C[i] = Integer.parseInt(st.nextToken());
            }

            long minCost = Long.MAX_VALUE;

            // Iterate over all valid pairs of stalls (i, j) with 1 <= i < j <= N
            for (int i = 1; i <= N; i++) {
                for (int j = i + 1; j <= N; j++) {
                    // Check coverage conditions:
                    // 1. First light covers stall 1: i - 1 <= K
                    // 2. Second light covers stall N: N - j <= K
                    // 3. No unlit gap between the two lights: j - i <= 2 * K + 1
                    if (i - 1 <= K && N - j <= K && j - i <= 2 * K + 1) {
                        long cost = (long) C[i] + C[j];
                        if (cost < minCost) {
                            minCost = cost;
                        }
                    }
                }
            }

            if (minCost == Long.MAX_VALUE) {
                sb.append("-1\n");
            } else {
                sb.append(minCost).append("\n");
            }
        }

        System.out.print(sb);
    }
}