/*
**********************PROBLEMS ON String ************************************
						Assignment 33
						
STATEMENT: 1. Write Java program which accept N numbers from user and return
difference between summation of even elements and summation of
odd elements.
Input : N : 6
Elements : 85 66 3 80 93 88
Output : 53 (234 - 181)
**********************************************************************************
*/

import java.util.*;

class Number1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		int iSize=0,iCnt=0, iRet=0;
		System.out.println("Enter How many elements wants to add:");
		iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
		
		System.out.println("Enter Numbers");
	   
	   for(iCnt=0; iCnt< Arr.length; iCnt++)
	   {
	       Arr[iCnt] = sobj.nextInt();
	   }
	   
	   ArrayDemo ademo= new ArrayDemo();
	   iRet=ademo.Difference(Arr);
	   System.out.println("difference between summation of even elements and summation of odd elements:"+iRet);
	}
}

class ArrayDemo
{
	public int Difference(int Arr[])
	{
		int iCnt=0, iEven=0, iOdd=0;
		for(iCnt=0;iCnt< Arr.length;iCnt++)
		{
			if((Arr[iCnt]%2)==0)
			{
				iEven=iEven+Arr[iCnt];
			}
			else
			{
				iOdd=iOdd+Arr[iCnt];
			}
		}
		return (iEven-iOdd);
	}
}