/*
**********************PROBLEMS ON String ************************************
						Assignment 33
						
STATEMENT: 5. Write Java program which accept N numbers from user and display
all such elements which are multiples of 11.
Input : N : 6
Elements : 85 66 3 55 93 88
Output : 66 55 88
**********************************************************************************
*/

import java.util.*;

class Number5
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
			if((Arr[iCnt]%11)==0)
			{
				System.out.println("The numbers multiply by 11 are:"+Arr[iCnt]);
			}
			
		}
		
	}
}