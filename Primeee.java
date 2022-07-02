import java.util.*;
	class Primeee
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			int i,n;
			System.out.println("enter a no");
			n=scn.nextInt();
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				break;
			}
			if(i==n)
			{
				System.out.println(n+"is prime");
			}
			else
			{
				System.out.println(n+"is not prime");
			}
		}
	}	