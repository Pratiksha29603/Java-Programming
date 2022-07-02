import java.util.*;
	class Percentage
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			int per;
			System.out.println("enter per");
			per=scn.nextInt();
			if(per>=0&&per<=100)
			{
				if(per>=40)
				System.out.println("student is pass");
				else
				System.out.println("student is fail");
			}
			else
			{
				System.out.println("plz enter per between 0 to 100");
			}
		}
    }		
