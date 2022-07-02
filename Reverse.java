import java.util.*;
	class Reverse
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
				int num,remainder,reverse=0;
				num=10;
				while(num>0)
				{
					remainder=num%10;
					reverse=reverse*10+remainder;
					num=num/10;
				}
				System.out.println("reverse no. is="+reverse);
		}
	}	