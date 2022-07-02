/*
**********************PROBLEMS ON String ************************************
						Assignment 33
						
STATEMENT: 3.Write a program which accept number from user and return the
count of digits in between 3 and 7.
Input : 2395
Output : 1
Input : 1018
Output : 0
Input : 4521
Output : 2
Input : 9922
Output : 0
**********************************************************************************
*/

import java.util.*;

class Digit3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0, iRet=0;
		System.out.println("Enter Number:");
		iValue=sobj.nextInt();
	
	    Digit dobj= new Digit();
		iRet=dobj.CountOdd(iValue);
		System.out.println("count of even digits:"+iRet);
	   
	}
}

class Digit
{
	public int CountOdd(int iNo)
	{
		int iDigit=0, iCnt=0; 
		if(iNo==0) //filter
	{
		return 0; 
	}
	
	if(iNo<0) // Input Updator
	{
		iNo=-iNo;
	}
	//Logic
	while(iNo!=0)  //while(iNo>0)
	{
		iDigit=iNo%10;
		if((iDigit>3)&&(iDigit<7)) //Check for odd
		{
			iCnt++;
		}
		iNo=iNo/10; 		
	
	}
	return iCnt;
	}
}