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
while(t-->0)
{
    int max = 1;
int current = 1;

for (int i = 1; i < n; i++) {
    boolean prevLeft = l.indexOf(s.charAt(i - 1)) != -1;
    boolean currLeft = l.indexOf(s.charAt(i)) != -1;

    if (prevLeft == currLeft) {
        current++;
    } else {
        current = 1;
    }

    if (current > max) {
        max = current;
    }
}

System.out.println(max);
}
sc.close();
	}
}
