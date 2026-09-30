import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            if (line == null) break;

            int n = Integer.parseInt(line.trim());
            
            st = new StringTokenizer(br.readLine());
            Map<Integer, Integer> freq = new HashMap<>();
            int maxFreq = 0;

            for (int i = 1; i <= n; i++) {
                int val = Integer.parseInt(st.nextToken()) - i;
                int count = freq.getOrDefault(val, 0) + 1;
                freq.put(val, count);
                maxFreq = Math.max(maxFreq, count);
            }

            sb.append(n - maxFreq).append("\n");
        }

        System.out.print(sb);
    }
}