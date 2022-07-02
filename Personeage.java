import java.util.*;
	class Personeage
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			int age;
			System.out.println("enter age");
			age=scn.nextInt();
			if(age>=0&&age<=120)
			{
				if(age>=18)
				System.out.println("persone is able");
				else
				System.out.println("persone is not able");
			}
			else
			{
				System.out.println("plz enter per between 0 to 120");
			}
		}
    }		
