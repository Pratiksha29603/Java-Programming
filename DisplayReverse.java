/* 	*****************PROBLEMS ON NUMBER**************************

STATEMENT: Accept the number from user and print the number in reverse order 
			from that number to 1. (using  for loop)
INPUT:12
OUTPUT: 12,11,10,9,8,7,6,5,4,3,2,1
*/

import java.util.*;

class DisplayReverse
{
	public static void  Reverse(int iNo)
	{
		int iCnt=0;
		if(iNo==0)
		{
			System.out.println("Invalid Input");
		}
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		
		for(iCnt=iNo; iCnt>=1; iCnt--)
		{
			System.out.println("Reverse Order is:"+iCnt);
		}
	}
	
	public static void main(String arg[])
	{
			int iValue=0;
			Scanner sobj = new Scanner(System.in);
			System.out.println("Enter Number");
			iValue=sobj.nextInt();
			Reverse(iValue);
	}
}