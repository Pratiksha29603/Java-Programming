/*
**********************PROBLEMS ON String ************************************
						in Java
STATEMENT:  Write Java program which accept String from user and reverse that string
			by using toString() method.
Input :  
Output : 
**********************************************************************************
*/
import java.util.*;
class Program155
{
	public static void main(String arg[])
	{
		Marvellous mobj = new Marvellous();
		mobj.Accept();
		mobj.Display();
		String s = mobj.ReverseX();
		System.out.println("Reverse string is : "+s);
	}
}
class StringX
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String");
		str = sobj.nextLine(); 
	}

	public void Display()
	{
		System.out.println("String is : "+str);
	}
}

class Marvellous extends StringX
{
	public String ReverseX()
	{
		char Arr[] = str.toCharArray();
		int iStart = 0, iEnd = Arr.length-1;
		char temp;
		while(iStart < iEnd)
		{
			temp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = temp;
			iStart++;
			iEnd--;
		}		
		return Arr.toString();
	}
}

