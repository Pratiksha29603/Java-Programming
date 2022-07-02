/*
**********************PROBLEMS ON String ************************************
						in Java
STATEMENT:  Write Java program which accept String from user and Display it on 
			screen
Input : 
Elements : 
Output : 
**********************************************************************************
*/

import java.util.*;

class Program149
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter String:");
		str=sobj.nextLine();
		
		Marvellous mobj=new Marvellous();
		mobj.Display(str);
	}
}

class Marvellous
{
	public void Display(String Data)
	{
		System.out.println("Welcome:"+Data);
	}
}
