import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc=new Scanner(System.in);
int c=sc.nextInt();
int m=sc.nextInt();
int w=sc.nextInt();
int p=sc.nextInt();
int r=sc.nextInt();
int score = (c * m) - (w * p);

        if (score >= r) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
	}
}
