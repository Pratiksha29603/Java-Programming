/*
**********************PROBLEMS ON String ************************************
						Assignment 33
						
STATEMENT: 1.Write a java program which accept number from user and return the
count of even digits.
Input : 2395
Output : 1
Input : 1018
Output : 2
Input : -1018
Output : 2
Input : 8462
Output : 4
**********************************************************************************
*/

import java.util.*;

class Digit1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0, iRet=0;
		System.out.println("Enter Number:");
		iValue=sobj.nextInt();
	
	    Digit dobj= new Digit();
		iRet=dobj.CountEven(iValue);
		System.out.println("count of even digits:"+iRet);
	   
	}
}

class Digit
{
	public int CountEven(int iNo)
	{
		int iDigit=0, iCnt=0; 
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
		if(iDigit%2==0) //Check for Even
		{
			iCnt++;
		}
		iNo=iNo/10; 		
	
	}
	return iCnt;
	}
}