import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if ((a+b)%2==0)
{
    System.out.println(Math.max(a,b)-Math.min(a,b));
}
else
{
    System.out.println(-1);
}
	}
}
