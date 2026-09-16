import java.util.*;
class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int[] P = new int[n];
            int[] pos = new int[n + 1];
            for (int i = 0; i < n; i++) 
            {
                P[i] = sc.nextInt();
                pos[P[i]] = i;
            }
            ArrayList<Integer>[] graph = new ArrayList[n + 1];
            int[] indegree = new int[n + 1];
            for (int i = 1; i <= n; i++)
            {
                graph[i] = new ArrayList<>();
            }
            for (int x = 1; x < n; x++) 
            {
                if (pos[x] < pos[x + 1])
                {
                    graph[x].add(x + 1);
                    indegree[x + 1]++;
                } else {
                    graph[x + 1].add(x);
                    indegree[x]++;
                }
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 1; i <= n; i++)
            {
                if (indegree[i] == 0)
                {
                    pq.add(i);
                }
            }
            StringBuilder ans = new StringBuilder();
            while (!pq.isEmpty())
            {
                int x = pq.poll();
                ans.append(x).append(" ");
                for (int y : graph[x]) 
                {
                    indegree[y]--;
                    if (indegree[y] == 0) 
                    {
                        pq.add(y);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
