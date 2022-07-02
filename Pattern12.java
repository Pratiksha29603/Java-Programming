/*
**********************PROBLEMS ON N Numbers in Array ************************************
						Assignment 38
						
Statement: below pattern.
Input : Hello
Output : H e l l o
H e l l
H e l
H e
H
**********************************************************************************
*/

import java.util.*;

class Pattern12
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
		for(i=Arr.length-1;i>=0;i--)
		{
			for(j=0;j<Arr.length;j++)
			{
			
				if(i>=j)
			{
				System.out.print(Arr[j]);
				System.out.print("\t");
			}
			
				
			}
			System.out.println();
		}
	}
}