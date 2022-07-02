/*
**********************PROBLEMS ON String ************************************
						in Java
STATEMENT:  Write Java program which accept String from user and count the Vowels in it
			using while loop
Input :  
Output : 
**********************************************************************************
*/

import java.util.*;

class Program152
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Marvellous mobj=new Marvellous();
		
		int iRet=0;
		mobj.Accept();
		mobj.Display();
		iRet=mobj.CountVowels();
		System.out.println("number of Vowels are:"+iRet);
		
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
	public int CountVowels()
	{
		char Arr[]=str.toCharArray();
		int iCnt=0,i=0;

		while(i<Arr.length)
		{
			if((Arr[i]=='a')||(Arr[i]=='e')||(Arr[i]=='i')||(Arr[i]=='o')||(Arr[i]=='u')||
			   (Arr[i]=='A')||(Arr[i]=='E')||(Arr[i]=='I')||(Arr[i]=='O')||(Arr[i]=='U'))
			   {
					iCnt++;
			   }
			   i++;
			   
		}
		return iCnt;
	}
}
