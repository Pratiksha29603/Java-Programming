/*
**********************PROBLEMS ON String ************************************
						Assignment 31
				
STATEMENT: 1.Write a Java program which accept string from user and count
number of capital characters.
Input : “Marvellous Multi OS”
Output : 4
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
		iRet=sdemo.CountCapital(str);
		System.out.println("number of capital characters are:"+iRet);
		
	}
}


class StringDemo
{
	public int CountCapital(String str)
	{
		int iCnt=0,iCap=0;
		char ch;
		for(iCnt=0; iCnt<str.length(); iCnt++)
		{
			ch=str.charAt(iCnt);
			if((ch>='A') && (ch<='Z'))
			{
				iCap++;
			}
		}
		return iCap;
	}
}