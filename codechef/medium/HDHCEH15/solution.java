import java.util.*;
import java.lang.*;
import java.io.*;

class Account{
    int t_id;
    float amount;
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Account transaction1 = new Account();
 
       // access data members t_id and amount from object transcaction1 and then assign values to them
       
       transaction1.t_id=1003;
       transaction1.amount=50000.0f;
       

        // access  t_id from transcation1 to print 
        System.out.println("The transaction ID is "+ transaction1.t_id);
        // access  amount from transcation1 to print 
        System.out.println("The amount spent is "+ transaction1.amount);
	}
}