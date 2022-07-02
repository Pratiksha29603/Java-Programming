/*
**********************PROBLEMS ON String ************************************
						Assignment 31
				
				
STATEMENT: 4. Write a java program which accept string from user and check
whether it contains vowels in it or not.
Input : “marvellous”
Output : TRUE
Input : “Demo”
Output : TRUE
Input : “xyz”
Output : FALSE
**********************************************************************************
*/

import java.util.*;

class String1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		boolean bRet=false;
		System.out.println("Enter String:");
		str=sobj.nextLine();
		StringDemo sdemo= new StringDemo();
		bRet=sdemo.ChkVowel(str);
		if(bRet==true)
		{
			System.out.println("String Contains Vowels");
		}
		else
		{
			System.out.println("String does not Contains Vowels");
		}
		
	}
}


class StringDemo
{
	public boolean ChkVowel(String str)
	{
		int iCnt=0;
		char ch;
		for(iCnt=0; iCnt<str.length(); iCnt++)
		{
			ch=str.charAt(iCnt);
			if((ch=='a') || (ch=='e')||(ch=='i') ||(ch=='o') ||(ch=='u')||
			   (ch=='A') ||(ch=='E') ||(ch=='I') ||(ch=='O') ||(ch=='U'))
			{
				return true;
			}
			
		}
		return false;
	}
}