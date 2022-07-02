import java.util.*;
	class Triangle
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			int a,b,c,sum;
			System.out.println("enter 3 no");
			a=scn.nextInt();
			b=scn.nextInt();
			c=scn.nextInt();
			sum=a+b+c;
			if(sum==180)
			{
				System.out.println("triangle is possible="+sum);
			}
			else
			{
			    System.out.println("triangle is not possible="+sum);
			}
		}
	}	
