import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in );
		int h=sc.nextInt();
		if(h<8)
		{
		    System.out.println("Less");
		}
		else if(h==8)
		{
		    System.out.println("Perfect");
		}
		else
		{
		    System.out.println("More");
		}

	}
}
