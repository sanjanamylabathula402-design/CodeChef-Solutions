import java.io.*;
import java.util.*;
class Codechef {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num;
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner sc = new FastScanner();

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();

            int[] P = new int[N + 1];
            int[] pos = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                P[i] = sc.nextInt();
                pos[P[i]] = i;
            }
            long answer = Long.MAX_VALUE;

            long leftCost = 0;

            for (int l = 1; l <= N; l++) {

                if (l > 1) {
                    int x = l - 1;

                    leftCost += pos[x] - 1;

                    for (int y = 1; y < x; y++) {
                        if (pos[y] > pos[x]) {
                            leftCost++;
                        }
                    }
                }

                long rightCost = 0;

                for (int r = N; r >= l; r--) {
                    if (r < N) {
                        int x = r + 1;

                        rightCost += N - pos[x];

                        for (int y = r + 2; y <= N; y++) {
                            if (pos[y] < pos[x]) {
                                rightCost++;
                            }
                        }
                    }
                    boolean possible = true;

                    for (int x = l; x < r; x++) {
                        if (pos[x] > pos[x + 1]) {
                            possible = false;
                            break;
                        }
                    }

                    if (possible) {
                        answer = Math.min(answer, leftCost + rightCost);
                    }
                }
            }

            System.out.println(answer);
        }
    }
}
