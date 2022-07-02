/*
**********************PROBLEMS ON String ************************************
						Assignment 34
						
STATEMENT: 2. Write java program which accept N numbers from user and accept
one another number as NO , return index of first occurrence of that
NO.
Input : N : 6
NO: 66
Elements : 85 66 3 66 93 88
Output : 1
Input : N : 6
NO: 12
Elements : 85 11 3 15 11 111
Output : -1
**********************************************************************************
*/

import java.util.*;

class Number7
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		int iSize=0,iCnt=0, iValue=0, iRet=0;
	
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
	   iRet=ademo.Check(Arr, iValue);
		System.out.println("First Occurance of number on Index:"+iRet);
	}
}

class ArrayDemo
{
	public int Check(int Arr[], int iNo)
	{
		int iCnt=0;
		for(iCnt=0;iCnt< Arr.length;iCnt++)
		{
			if(Arr[iCnt]==iNo)
			{
				
				break;
			}
			else
			{
				return -1;
			}
		
		}
		return iCnt;
	}
}