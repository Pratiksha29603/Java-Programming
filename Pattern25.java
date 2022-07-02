/*
**********************PROBLEMS ON N Numbers in Array ************************************
						Assignment 40
						
Statement: 5. Write a java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output :
1 2 3 4 5
1 2 	5
1 	3 	5
1 	  4 5
1 2 3 4 5
**********************************************************************************
*/

import java.util.*;

class Pattern24
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
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i==1||i==iRow||j==1||j==iCol||i==j)
				{
					System.out.print(j);
					System.out.print("\t");
				}
			
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
	}
				
	}
}