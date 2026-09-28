import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int A[][] = new int[N][M];
        int dist[][] = new int[N][M];

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();

                if (A[i][j] == 0) {
                    dist[i][j] = 0;
                    q.add(i * M + j);
                } else {
                    dist[i][j] = -1;
                }
            }
        }

        int rowMove[] = {-1, 1, 0, 0};
        int colMove[] = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int current = q.poll();

            int row = current / M;
            int col = current % M;

            for (int k = 0; k < 4; k++) {
                int newRow = row + rowMove[k];
                int newCol = col + colMove[k];

                if (newRow >= 0 && newRow < N &&
                    newCol >= 0 && newCol < M &&
                    dist[newRow][newCol] == -1) {

                    dist[newRow][newCol] = dist[row][col] + 1;

                    q.add(newRow * M + newCol);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }
}