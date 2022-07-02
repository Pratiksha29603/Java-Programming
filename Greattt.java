import java.util.*;
	class Typetriangl
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			int a,b,c;
			System.out.println("enter 3 no");
			a=scn.nextInt();
			b=scn.nextInt();
			c=scn.nextInt();
			if(a>b&&a>c)
			{
				System.out.println("greatest no="+a);
			}
			else if(b>a&&b>c)
			{
				System.out.println("greatest no="+b);
			}
			else
			{
				System.out.println("greatest no="+c);
			}
		}
	}	
