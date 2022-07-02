import java.util.*;
	class Switch
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			int a,b,c,choice;
			System.out.println("enter 2 no.");
			a=scn.nextInt();
			b=scn.nextInt();
			System.out.println("1]add");
			System.out.println("2]sub");
			System.out.println("3]mul");
			System.out.println("4]div");
			System.out.println("enter ur choice");
			choice=scn.nextInt();
			switch(choice)
			{
				case 1:
				c=a+b;
				System.out.println("add="+c);
				break;
				case 2:
				c=a-b;
				System.out.println("sub="+c);
				break;
				case 3:
				c=a*b;
				System.out.println("mul="+c);
				break;
				case 4:
				c=a/b;
				System.out.println("div="+c);
				break;
				default:
				System.out.println("enter choice between 1 to 4");
				
			}
		}
	}