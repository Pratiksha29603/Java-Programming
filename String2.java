/*
**********************PROBLEMS ON String ************************************
						Assignment 31
				
				
STATEMENT: 2. Write a java program which accept string from user and count
number of small characters.
Input : “Marvellous”
Output : 9
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
		iRet=sdemo.CountSmall(str);
		System.out.println("number of Small characters are:"+iRet);
		
	}
}


class StringDemo
{
	public int CountSmall(String str)
	{
		int iCnt=0,iSmall=0;
		char ch;
		for(iCnt=0; iCnt<str.length(); iCnt++)
		{
			ch=str.charAt(iCnt);
			if((ch>='a') && (ch<='z'))
			{
				iSmall++;
			}
		}
		return iSmall;
	}
}