/*
**********************PROBLEMS ON N Numbers in Array ************************************
						Assignment 34
						
STATEMENT: 4. Write java program which accept N numbers from user and accept
Range, Display all elements from that range
Input : N : 6
Start: 60
End : 90
Elements : 85 66 3 76 93 88
Output : 66 76 88
Input : N : 6
Start: 30
End : 50
Elements : 85 66 3 76 93 88
Output :
**********************************************************************************
*/

import java.util.*;

class Number9
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		int iSize=0,iCnt=0, iValue=0;
	
		System.out.println("Enter How many elements wants to add:");
		iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
		
		System.out.println("Enter Numbers");
	   
	   for(iCnt=0; iCnt< Arr.length; iCnt++)
	   {
	       Arr[iCnt] = sobj.nextInt();
	   }
	   
	   System.out.println("Enter Starting Number:");
	    int iStart=sobj.nextInt();
		
		System.out.println("Enter Ending Number:");
	    int iEnd=sobj.nextInt();
		
	   ArrayDemo ademo= new ArrayDemo();
	   ademo.Check(Arr,iStart,iEnd);
		
	}
}

class ArrayDemo
{
	public void Check(int Arr[], int iStart, int iEnd)
	{
		int iCnt=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]>iStart)&&(Arr[iCnt]<iEnd))
			{
				System.out.println(Arr[iCnt]);
			}
		
		}
	
	}
}