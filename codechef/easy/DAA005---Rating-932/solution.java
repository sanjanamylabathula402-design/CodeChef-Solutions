import java.util.*;

public class Main {
    public static void sort (int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int min_val = arr[i];
            int min_idx = i;
            for(int j = i + 1; j < n; j++) {
                if(min_val > arr[j]) {
                    min_val = arr[j];
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sort(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}