import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
while (t-->0)
{
    int n=sc.nextInt();
    String a=sc.next();
    String b=sc.next();
    int countOfa=0;
    int countOfb=0;
    for(int i=0;i<a.length();i++)
	{
	    if(a.charAt(i)=='a')
	    {
	        countOfa++;
	    }
	    if(b.charAt(i)=='a')
	    {
	        countOfb++;
	    }
	}
	if(countOfa+countOfb == n)
	{
	    System.out.println("yes");
	}
	else
	{
	    System.out.println("no");
	}
}
}
}
