/*
**********************PROBLEMS ON String ************************************
						Assignment 33
						
STATEMENT: 5.Write a program which accept number from user and return
difference between summation of even digits and summation of odd
digits.
Input : 2395
Output : -15 (2 - 17)
Input : 1018
Output : 6 (8 - 2)
Input : 8440
Output : 16 (16 - 0)
Input : 5733
Output : -18 (0 - 18)
**********************************************************************************
*/

import java.util.*;

class Digit5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0, iRet=0;
		System.out.println("Enter Number:");
		iValue=sobj.nextInt();
	
	    Digit dobj= new Digit();
		iRet=dobj.CountDiff(iValue);
		System.out.println("difference between summation of even digits and summation of odd:"+iRet);
	   
	}
}

class Digit
{
	public int CountDiff(int iNo)
	{
		int Even=0,Odd=0,Diff=0;
		int iDigit=0;
		if(iNo==0) //filter
		{
			return 1;
		}
	
		if(iNo<0) // Input Updator
		{
			iNo=-iNo;
		}
			//Logic
		while(iNo!=0)  //while(iNo>0)
		{
			iDigit=iNo%10;
		
				if(iDigit%2==0)
				{
					Even=Even+iDigit;
				}
				else
				{
					Odd=Odd+iDigit;
				}
				iNo=iNo/10; 		
	
		}
			Diff=Even-Odd;
			return Diff;
	}
}