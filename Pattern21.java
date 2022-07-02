/*
**********************PROBLEMS ON N Numbers in Array ************************************
						Assignment 40
						
Statement: 1. Write a java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 
* * * #
* * # *
* # * *
# * * *
**********************************************************************************
*/

import java.util.*;

class Pattern21
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
		int i=0, j=0;
		if(iRow!=iCol)
		{
			System.out.println("Plz Enter Row and Colunm size equal...");
			return;
		}
		for(i=iRow-1;i>=0;i--)
		{
			for(j=0;j<iCol;j++)
			{
			
				if((i==j))
				{
					System.out.print("#");
					System.out.print("\t");
				}
				else
				{
					System.out.print("*");
					System.out.print("\t");
				}
			
			}	
			System.out.println();
		}
				
	}
}