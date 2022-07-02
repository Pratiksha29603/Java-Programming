import java.util.*;
	class Small
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			int a,b,small;
			System.out.println("enter 2 no");
			a=scn.nextInt();
			b=scn.nextInt();
			small=(a<b)?(a):(b);
			System.out.println("smallest no="+small);

		}
	}	
