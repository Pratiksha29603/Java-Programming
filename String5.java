/*
**********************PROBLEMS ON String ************************************
						Assignment 31
				
				
STATEMENT: 5. Write a java program which accept string from user and display
it in reverse order.
Input : “MarvellouS”
Output : “SuollevraM”
**********************************************************************************
*/

import java.util.*;

class String1
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
		System.out.println("Reverse String is"+Rev);
	}
}