import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		
		String s=sc.nextLine().trim();
		String t=sc.nextLine().trim();
		if(s.length()!=t.length())
		{
		System.out.println("false");
		return;
		
		}
		int charCount[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
		    charCount[s.charAt(i)-'a']++;
		}
		    for(int i=0;i<t.length();i++)
		    {
		    charCount[t.charAt(i)-'a']--;
		}
		boolean isAnagram=true;
		for(int count:charCount)
		{
		    if(count!=0)
		    {
		        isAnagram=false;
		        break;
		    }
		}
		if(isAnagram)
		{
		    System.out.println("true");
		}
		else{
		    System.out.println("false");
		}
		sc.close();
		
	}
}
