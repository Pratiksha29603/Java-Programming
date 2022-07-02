/*
**********************PROBLEMS ON String ************************************
						Assignment 34
						
STATEMENT: 1. Write java program which accept N numbers from user and accept
one another number as NO , check whether NO is present or not.
Input : N : 6
NO: 66
Elements : 85 66 3 66 93 88
Output : TRUE
Input : N : 6
NO: 12
Elements : 85 11 3 15 11 111
Output : FALSE
**********************************************************************************
*/

import java.util.*;

class Number6
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		int iSize=0,iCnt=0, iValue=0;
		boolean bRet=false;
		System.out.println("Enter How many elements wants to add:");
		iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
		
		System.out.println("Enter Numbers");
	   
	   for(iCnt=0; iCnt< Arr.length; iCnt++)
	   {
	       Arr[iCnt] = sobj.nextInt();
	   }
	   
	   System.out.println("Enter Number want to search");
	   iValue=sobj.nextInt();
	   ArrayDemo ademo= new ArrayDemo();
	   bRet=ademo.Check(Arr, iValue);
	   if(bRet==true)
	   {
			 System.out.println("Number is present");
	   }
	   else
	   {
			 System.out.println("Number is not present");
	   }
	}
}

class ArrayDemo
{
	public boolean Check(int Arr[], int iNo)
	{
		int iCnt=0, iEven=0, iOdd=0;
		for(iCnt=0;iCnt< Arr.length;iCnt++)
		{
			if(Arr[iCnt]==iNo)
			{
				return true;
			}
		
		}
		return false;
	}
}