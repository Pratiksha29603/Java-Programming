import java.util.*;
	class Incometax
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			int sal,tax,total;
			System.out.println("enter sal");
			sal=scn.nextInt();
			if(sal<250000)
			{
				System.out.println("no tax");
			}
			else if(sal>250000||sal<500000)
			{
				sal=sal-250000;
				tax=(sal*100*10);
				System.out.println("tax="+tax);
			}
			else
			{
				sal=sal-500000;
				tax=(sal/100*20)+25000;
				System.out.println("tax="+tax);
				total=sal-tax;
		
			}
		}
	}	
		