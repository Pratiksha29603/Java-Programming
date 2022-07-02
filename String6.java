/*
**********************PROBLEMS ON String ************************************
						Assignment 35
				
				
Statement: 4. Accept sing from user and reverse the contents of that string
by toggling the case.
Input : “aCBdef”
Output : “FEDcbA”
**********************************************************************************
*/

import java.util.*;

class String6
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		int iRet=0;
		System.out.println("Enter String:");
		str=sobj.nextLine();
		StringDemo sdemo= new StringDemo();
		sdemo.Reverse(str);
		
	}
}


class StringDemo
{
	public void Reverse(String str)
	{
		int iCnt=0;
		char ch;
		String Rev;
		for(iCnt=str.length(); iCnt>=0; iCnt--)
		{
			
			Rev=Rev+str.charAt(iCnt);
			
		}
		if(*Rev)
		System.out.println("Reverse String is"+Rev);
	}
}