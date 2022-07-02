 /* 	*****************PROBLEMS ON ARRAY OOP**************************

STATEMENT:
 
**********************************************************************************
*/
 
 
 import java.util.*;

class ArrayOOP
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();
		
		Array obj=new Array(size);
		obj.Accept();
		
		int iRet=obj.Addition();
		
		System.out.println("Addition of all element:"+iRet);
	}
}

class Array
 {
	public int arr[];
	
	public Array(int iSize)
	{
		arr=new int[iSize];
	}
 
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the Elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sobj.nextInt();
		}
	}
	
	public int Addition()
	{
		int iSum=0;
		for(int i=0;i<arr.length;i++)
		{
			iSum=iSum+arr[i];
		}   
		return iSum;
	}
 }
