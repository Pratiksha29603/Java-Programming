 /* 	*****************PROBLEMS ON N NUMBERS**************************

STATEMENT:Write a java program which accepts N numbers from user and store it into Array and
display the average of all the numbers from array.

Input:5={10,20,30,40,50}
Output: 30.0
 
**********************************************************************************
*/ 
 
 
 
import java.util.*;

class Average
{
	public static void main(String arg[])
	{
		
		int arr[];
		int iSize=0,i=0,iSum=0;
		float fAvg=0.0f;
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
			iSum=iSum+arr[i];
		}
		fAvg=iSum/arr.length;
		System.out.println("Addition of all element:"+fAvg);
	}
}




