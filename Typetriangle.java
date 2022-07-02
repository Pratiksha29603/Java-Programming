import java.util.*;
	class Typetriangle
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			int a,b,c;
			System.out.println("enter 3 no");
			a=scn.nextInt();
			b=scn.nextInt();
			c=scn.nextInt();
			if((a<90)&&(b<90)&&(c<90))
			{
				System.out.println("triangle is ia acute angle triangle");
			}
			else if((a=>90)&&(b=>90)&&(c=>90))
			{
			    System.out.println("triangle is is obtuse angle triangle");
			}
			else
			{
				if((a==90)&&(b==90)&&(c==90))
				{
					System.out.println("triangle is right angle triangle");
				}
			}
		}
	}	
