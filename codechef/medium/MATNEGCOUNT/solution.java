import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int countNegatives(int[][] matrix) 
    {
        int r = matrix.length;
        int c = matrix[0].length;
        int row_index = 0;
        int col_index = c - 1;
        int negatives_count = 0;
        
        while (row_index < r) 
        {
            while (col_index >= 0 && matrix[row_index][col_index] < 0) 
            {
                col_index--;
            }
            negatives_count += c - col_index - 1;
            row_index++;
        }
        
        return negatives_count;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println(countNegatives(mat));
	}
}
