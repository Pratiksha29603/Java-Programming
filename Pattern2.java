/*
**********************PROBLEMS ON N Numbers in Array ************************************
						Assignment 36
						
Statement: 2. Write Java program which accept number of rows and number of columns
from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : A B C D
a b c d
A B C D
a b c d
**********************************************************************************
*/

import java.util.*;

class Pattern2
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
		char ch= 'A',cVal='a';
		if(iRow != iCol)
		{
          return;
		}
      
		for(i=1,ch='A',cVal='a'; i<=iRow; i++,ch++,cVal++)
      {
          for(j=1,ch='A',cVal='a'; j<=iCol; j++,ch++,cVal++)
          {
             if(i%2!=0)
			{
				System.out.print(ch);
				System.out.print("\t");	
			}
			else
			{
				System.out.print(cVal);
				System.out.print("\t");	
			}	 
          }
            System.out.println();	
      }
	}
}