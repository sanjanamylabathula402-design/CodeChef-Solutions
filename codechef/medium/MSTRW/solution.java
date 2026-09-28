import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int K = sc.nextInt();

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Max heap
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int f : freq) {
            if (f > 0) {
                pq.add(f);
            }
        }

        // Remove K characters
        while (K > 0) {
            int maxFreq = pq.poll();

            maxFreq--;

            if (maxFreq > 0) {
                pq.add(maxFreq);
            }

            K--;
        }

        long answer = 0;

        for (int f : pq) {
            answer += (long) f * f;
        }

        System.out.println(answer);

        sc.close();
    }
}