import java.util.*;
	class Saltax
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			int sal,tax,total;
			System.out.println("enter sal");
			sal=scn.nextInt();
			tax=(sal<15000)?(sal/100*10):(sal/100*15);
			total=sal-tax;
			System.out.println("tax amount="+tax);
			System.out.println("total sal="+total);
			
		}
	}	
		