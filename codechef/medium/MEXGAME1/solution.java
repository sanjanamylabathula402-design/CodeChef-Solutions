import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
            }

            // Find the MEX of the array
            int mex = 0;
            while (freq.containsKey(mex)) {
                mex++;
            }

            long totalMoves = 0;

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                int val = entry.getKey();
                int count = entry.getValue();

                if (val > mex) {
                    // All elements > mex can be reduced down to mex
                    totalMoves += (long) count * (val - mex);
                } else if (val < mex) {
                    // Extra copies of elements < mex can be reduced down to 0
                    if (count > 1) {
                        totalMoves += (long) (count - 1) * val;
                    }
                }
            }

            if (totalMoves % 2 != 0) {
                out.println("Alice");
            } else {
                out.println("Bob");
            }
        }

        out.flush();
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() throws IOException {
            while (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}