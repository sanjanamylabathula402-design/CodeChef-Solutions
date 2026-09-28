import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int A[] = new int[N * N];
        int B[] = new int[M * M];

        for (int i = 0; i < N * N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < M * M; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        int j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                break;
            }
        }

        if (j == B.length) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}