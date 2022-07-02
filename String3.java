/*
**********************PROBLEMS ON String ************************************
						Assignment 31
				
				
STATEMENT: 3. Write a java program which accept string from user and return
difference between frequency of small characters and frequency
of capital characters.
Input : “MarvellouS”
Output : 6 (8-2)
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
		iRet=sdemo.CountDiff(str);
		System.out.println("number of Small characters are:"+iRet);
		
	}
}


class StringDemo
{
	public int CountDiff(String str)
	{
		int iCnt=0,iUpper=0, iLower=0;
		char ch;
		for(iCnt=0; iCnt<str.length(); iCnt++)
		{
			ch=str.charAt(iCnt);
			if((ch>='a') && (ch<='z'))
			{
				iLower++;
			}
			else if((ch>='A') && (ch<='Z'))
			{
				iUpper++;
			}
		}
		return (iLower-iUpper);
	}
}