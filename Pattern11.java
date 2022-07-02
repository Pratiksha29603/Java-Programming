/*
**********************PROBLEMS ON N Numbers in Array ************************************
						Assignment 38
						
Statement: 1. Write Java program which accept String from user and display
below pattern.
Input : Hello
Output : H e l l o
H e l l o
H e l l o
H e l l o
**********************************************************************************
*/

import java.util.*;

class Pattern11
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
	
		System.out.println("Enter String:");
		String str=sobj.nextLine();
		
		Pattern pobj= new Pattern();
		pobj.Pattern(str);
		
	}
}

class Pattern
{
	public void Pattern(String str)
	{
		char Arr[]=str.toCharArray();
		int i=0,j=0;
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr.length;j++)
			{
				System.out.print(Arr[j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}