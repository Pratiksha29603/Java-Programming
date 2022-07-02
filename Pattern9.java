/*
**********************PROBLEMS ON N Numbers in Array ************************************
						Assignment 37
						
Statement: 4. Write Java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 3 iCol = 4
Output : * # * #
* # * #
* # * #
**********************************************************************************
*/

import java.util.*;

class Pattern9
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
			for(j=1;j<=iCol/2;j++)
			{
				System.out.print("*\t#\t");	
			}
			System.out.println();
		}
	}
}	