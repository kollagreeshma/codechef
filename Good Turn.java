import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++)
		{
    		int X = sc.nextInt();
    		int Y = sc.nextInt();
    		if((X+Y)>6)
    		System.out.println("YES");
    		else
    		System.out.println("NO");
    		
		}
		
	}
}