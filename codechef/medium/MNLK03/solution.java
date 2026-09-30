import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc=new Scanner (System.in);
if(sc.hasNextInt())
{
    int t=sc.nextInt();
    while(t-->0)
    {
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int pressCount=0;
        for(int i=0;i<n;i++)
        {
            int currentState=a[i];
            if( pressCount %2 != 0)
            {
                currentState = 1-currentState;
            }
            if(currentState ==0)
            {
                pressCount++;
            }
        }
        System.out.println(pressCount);
        
    }
}
sc.close();
	}
}
