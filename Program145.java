/*
**********************PROBLEMS ON Number ************************************
						OOP in Java
				
STATEMENT: Create Array take input and add that number 
**********************************************************************************
*/

import java.util.*;

class Program145
{
	public static void main(String arg[]) 
	{
	   Scanner sobj = new Scanner(System.in); 
	   int iLength=0, iRet=0;
	   
	   System.out.println("Enter the Number of elements:");
	   iLength=sobj.nextInt();
	   
	   Marvellous mobj=new Marvellous(iLength);
	   mobj.Accept();
	   mobj.Display();
	   iRet=mobj.Add();
	   System.out.println("Addition is:"+iRet);
	} 
}

class ArrayX
{
	public int Arr[];
	
	public ArrayX(int iSize)
	{
		Arr=new int[iSize];
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		int iCnt=0;
		System.out.println("Enter Elements");
		for(iCnt=0;iCnt< Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}
	
	public void Display()
	{
		int iCnt=0;
		System.out.println("Elements are:");
		for(iCnt=0;iCnt< Arr.length; iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}

class Marvellous extends ArrayX
{
	public Marvellous(int iValue)
	{
		super(iValue); // to call parent class constuctor
	}
	
	public int Add()
	{
		int iSum=0, iCnt=0;
		for(iCnt=0;iCnt < Arr.length; iCnt++)
		{
			iSum=iSum+Arr[iCnt];
		}
		return iSum;
	}
}