import java.io.*;
import java.util.*;
class Codechef 
{
    static final long MOD = 998244353;
    public static void main(String[] args) throws Exception
    {
        FastScanner sc = new FastScanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) 
        {
            int N = sc.nextInt();
            int[] P = new int[N];
            int[] pos = new int[N + 1];
            for (int i = 0; i < N; i++)
            {
                P[i] = sc.nextInt();
                pos[P[i]] = i;
            }
            boolean[] sign = new boolean[N];
            for (int i = 1; i < N; i++) {
                sign[i] = pos[i] < pos[i + 1];
            }
            long[] dp = new long[N + 1];
            long[] next = new long[N + 1];
            dp[1] = 1;
            for (int i = 1; i < N; i++)
            {
                long sum = 0;
                if (sign[i]) 
                {
                    for (int j = 1; j <= i + 1; j++) 
                    {
                        if (j > 1)
                        {
                            sum += dp[j - 1];
                            if (sum >= MOD)
                                sum -= MOD;
                        }
                        next[j] = sum;
                    }
                } else {
                    sum = 0;
                    for (int j = i; j >= 1; j--) 
                    {
                        sum += dp[j];
                        if (sum >= MOD)
                            sum -= MOD;
                        next[j] = sum;
                    }
                    next[i + 1] = 0;
                }

                long[] temp = dp;
                dp = next;
                next = temp;
                Arrays.fill(next, 0);
            }
            long answer = 0;
            for (int j = 1; j <= N; j++)
            {
                answer += dp[j];
                if (answer >= MOD)
                    answer -= MOD;
            }
            System.out.println(answer);
        }
    }
    static class FastScanner
    {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;
        FastScanner(InputStream in)
        {
            this.in = in;
        }
        private int read() throws IOException
        {
            if (ptr >= len) 
            {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0)
                    return -1;
            }

            return buffer[ptr++];
        }

        int nextInt() throws IOException {

            int c;
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int res = 0;

            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }

            return res * sign;
        }
    }
}
