/*
**********************PROBLEMS ON N Numbers in Array ************************************
						Assignment 34
						
5. Write java program which accept N numbers from user and return
product of all odd elements.
Input : N : 6
Elements : 15 66 3 70 10 88
Output : 45
Input : N : 6
Elements : 44 66 72 70 10 88
Output : 0
**********************************************************************************
*/

import java.util.*;

class Number10
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
	   
	   ArrayDemo ademo= new ArrayDemo();
	   iRet=ademo.Check(Arr);
		System.out.println("product of all odd elements:"+iRet);
	}
}

class ArrayDemo
{
	public int Check(int Arr[])
	{
		int iCnt=0, iMul=1;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]%2)!=0)
			{
				iMul=iMul*Arr[iCnt];
			}
		
		}
			return iMul;
	}
}