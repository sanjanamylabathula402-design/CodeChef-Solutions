import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        if (s == null) {
            s = "";
        }

        String lineK = br.readLine();
        while (lineK != null && lineK.trim().isEmpty()) {
            lineK = br.readLine();
        }
        
        int K = 0;
        if (lineK != null) {
            K = Integer.parseInt(lineK.trim());
        }

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int count : freq) {
            if (count > 0) {
                pq.add(count);
            }
        }

        while (K > 0 && !pq.isEmpty()) {
            int maxFreq = pq.poll();
            maxFreq--;
            K--;
            if (maxFreq > 0) {
                pq.add(maxFreq);
            }
        }

        long minWeight = 0;
        while (!pq.isEmpty()) {
            long f = pq.poll();
            minWeight += f * f;
        }

        System.out.println(minWeight);
    }
}