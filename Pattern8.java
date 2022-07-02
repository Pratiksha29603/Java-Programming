/*
**********************PROBLEMS ON N Numbers in Array ************************************
						Assignment 37
						
Statement: 3. Write Java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 3 iCol = 5
Output : 5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
**********************************************************************************
*/

import java.util.*;

class Pattern8
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
		int i=0,j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=iCol;j>=1;j--)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}