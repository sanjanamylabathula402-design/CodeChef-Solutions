// Solution as follows
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		int y = read.nextInt();
    		
    		int prize_top10 = 10 * x;
    		
    		//There was a logical error in this line. Rank 11 to 100 includes 90 participants. Not 89.
    		int prize_11to100 = 90 * y;
    		System.out.println(prize_top10 + prize_11to100);
		}
	}
}