/* 	*****************PROBLEMS ON N NUMBERS**************************

STATEMENT:Write a java program which accepts N numbers from user and store it into Array and
display the largest number from that array

Input:5={10,20,30,40,50}
Output: 50
 
**********************************************************************************
*/ 
 
 import java.util.*;

class Largest
{
	public static void main(String arg[])
	{
		int arr[];
		int iSize=0,i=0,iMax=0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the size of array");
		iSize = sobj.nextInt();
		
		arr=new int[iSize];
		
		System.out.println("Enter the element");
		
		for(i=0; i<arr.length; i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]>iMax)
			iMax=arr[i];
		}
		System.out.println("Largest element in the array is:"+iMax);
	}
}




