/*
**********************PROBLEMS ON String ************************************
						Assignment 33
						
STATEMENT: 2. Write Java program which accept N numbers from user and display
all such elements which are divisible by 5.
Input : N : 6
Elements : 85 66 3 80 93 88
Output : 85 80
**********************************************************************************
*/

import java.util.*;

class Number2
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
		ademo.Difference(Arr);
	   
	}
}

class ArrayDemo
{
	public void Difference(int Arr[])
	{
		int iCnt=0, iSum=0;
		for(iCnt=0;iCnt< Arr.length;iCnt++)
		{
			if((Arr[iCnt]%5)==0)
			{
				System.out.println("The numbers Divisible by 5 are:"+Arr[iCnt]);
			}
			
		}
		
	}
}