/*
**********************PROBLEMS ON String ************************************
						Assignment 33
						
STATEMENT: 4.Write a program which accept number from user and return
multiplication of all digits.
Input : 2395
Output : 270
Input : 1018
Output : 8
Input : 9440
Output : 144
Input : 922432
Output : 864
**********************************************************************************
*/

import java.util.*;

class Digit4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0, iRet=0;
		System.out.println("Enter Number:");
		iValue=sobj.nextInt();
	
	    Digit dobj= new Digit();
		iRet=dobj.CountMul(iValue);
		System.out.println("multiplication of all digits:"+iRet);
	   
	}
}

class Digit
{
	public int CountMul(int iNo)
	{
		int iDigit=0, iMul=1; 
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
		
			iMul=iMul*iDigit;
			iNo=iNo/10; 		
	
		}
		return iMul;
	}
}