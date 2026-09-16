import java.io.*;
import java.util.*;

class Codechef {

    static class Fenwick {
        int n;
        int[] tree;

        Fenwick(int n) {
            this.n = n;
            tree = new int[n + 1];
        }

        void add(int index, int value) {
            while (index <= n) {
                tree[index] += value;
                index += index & -index;
            }
        }

        int sum(int index) {
            int result = 0;

            while (index > 0) {
                result += tree[index];
                index -= index & -index;
            }

            return result;
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner sc = new FastScanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();

            int[] pos = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                int x = sc.nextInt();
                pos[x] = i;
            }

            long[] front = new long[N + 1];

            Fenwick bit = new Fenwick(N);

            for (int x = 1; x < N; x++) {
                int smallerBefore = bit.sum(pos[x] - 1);
                int smaller = x - 1;

                long cost = (pos[x] - 1L) + smallerBefore;

                front[x + 1] = front[x] + cost;

                bit.add(pos[x], 1);
            }

            long[] back = new long[N + 1];

            bit = new Fenwick(N);

            for (int x = N; x >= 2; x--) {

                int largerAfter =
                        bit.sum(N) - bit.sum(pos[x]);

                back[x - 1] = back[x] + largerAfter;

                bit.add(pos[x], 1);
            }

            int[] maxR = new int[N + 1];

            int current = N;

            for (int l = N - 1; l >= 1; l--) {

                if (pos[l] > pos[l + 1]) {
                    current = l;
                }

                maxR[l] = current;
            }

            maxR[N] = N;

            Fenwick activeValues = new Fenwick(N);
            Fenwick movedHigh = new Fenwick(N);

            long middleCost = 0;
            int oldR = N;

            long answer = Long.MAX_VALUE;

            for (int l = N; l >= 1; l--) {

                middleCost += movedHigh.sum(pos[l] - 1);

                activeValues.add(pos[l], 1);

                int r = maxR[l];

                for (int x = r + 1; x <= oldR; x++) {

                    int activeAfter =
                            activeValues.sum(N)
                            - activeValues.sum(pos[x]);

                    middleCost += activeAfter;

                    movedHigh.add(pos[x], 1);
                }

                oldR = r;

                long currentCost =
                        front[l]
                        + middleCost
                        + back[r];

                answer = Math.min(answer, currentCost);
            }

            System.out.println(answer);
        }
    }

    static class FastScanner {

        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];

        private int ptr = 0;
        private int len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {

            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0) {
                    return -1;
                }
            }

            return buffer[ptr++];
        }

        int nextInt() throws IOException {

            int c;

            do {
                c = read();
            } while (c <= ' ');

            int number = 0;

            while (c > ' ') {
                number = number * 10 + (c - '0');
                c = read();
            }

            return number;
        }
    }
}