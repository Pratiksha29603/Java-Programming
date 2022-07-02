/*
**********************PROBLEMS ON String ************************************
						in Java
STATEMENT:  Write Java program which accept String from user and reverse that string
Input :  
Output : 
**********************************************************************************
*/

/*
**********************PROBLEMS ON String ************************************
						in Java
STATEMENT:  Write Java program which accept String from user and count the Vowels 
			in it using for loop
Input : 
Elements : 
Output : 
**********************************************************************************
*/

import java.util.*;

class Program153
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Marvellous mobj=new Marvellous();
		
		mobj.Accept();
		mobj.Display();
		String s=mobj.ReverseX();
		System.out.println("Reverse String is:"+s);
		
	}
}

class StringX 
{
	public String str;
	
	public void Accept() //geter method
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String:");
		str=sobj.nextLine();
		
	}
	public void Display() //seter method
	{
		System.out.println("String is:"+str);
	}
}

class Marvellous extends StringX
{
	public String ReverseX()
	{
		char Arr[]=str.toCharArray(); //convert string to char Array
		int iStart=0,iEnd=Arr.length-1;
		char temp;
		while(iStart<iEnd)
		{
			temp=Arr[iStart];
			Arr[iStart]=Arr[iEnd];
			Arr[iEnd]=temp;
			iStart++;
			iEnd--;
		}
		return new String(Arr); 
		
	}
}
