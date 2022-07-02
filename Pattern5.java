/*
**********************PROBLEMS ON N Numbers in Array ************************************
						Assignment 36
						
Statement:5. Write Java program which accept number of rows and number of columns
from user and display below pattern.
Input : iRow = 3 iCol = 4
Output : 1 2 3 4
	     5 6 7 8
         9 10 11 12
**********************************************************************************
*/

import java.util.*;

class Pattern5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		int iRow=0, iCol=0;
	
		System.out.println("Enter Row Size:");
		iRow=sobj.nextInt();
		
		System.out.println("Enter Colunm Size:");
		iCol=sobj.nextInt();
	
	   Pattern pobj= new Pattern();
	   pobj.Pattern(iRow, iCol);
		
	}
}

class Pattern
{
	public void Pattern(int iRow, int iCol)
	{
		int i=0,j=0,k=1;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print(k);
				k++;
				System.out.print("\t");
			}
			System.out.println();
			
		}
	}
}