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

class Program150
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		StringX sobjx=new StringX();
		sobjx.Accept();
		sobjx.Display();
		
	}
}

class StringX 
{
	public String str;
	
	public void Accept() //geter method
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String");
		str=sobj.nextLine();
		
	}
	public void Display() //seter method
	{
		System.out.println("String is:"+str);
	}
}
