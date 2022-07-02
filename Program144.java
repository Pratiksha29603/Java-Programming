/*
**********************PROBLEMS ON Number ************************************
					
STATEMENT: Create Array take input and add that number 
**********************************************************************************
*/

import java.util.*;

class Program144
{
	public static void main(String arg[]) 
	{
	   Scanner sobj = new Scanner(System.in); 
	   int iSize = 0, iCnt= 0, iRet=0;
	   
	   System.out.println("Enter Number of Elements");
	   iSize = sobj.nextInt();
	   
	   
	   //Arr=(int*)malloc(sizeof(int)*iSize);
	   int Arr[] = new int[iSize];
	   
	   System.out.println("Enter Numbers");
	   
	   for(iCnt=0; iCnt<Arr.length; iCnt++)
	   {
	       Arr[iCnt] = sobj.nextInt();
	   }
	    Marvellous mobj=new Marvellous();
		iRet=mobj.Add(Arr);
		System.out.println("Addition is:"+iRet);
	}
}

class Marvellous
{
	public int Add(int Brr[])
	{
		int iSum=0, iCnt=0;
		for(iCnt=0;iCnt<Brr.length; iCnt++)
		{
			iSum=iSum+Brr[iCnt];
		}
		return iSum;
	}
}