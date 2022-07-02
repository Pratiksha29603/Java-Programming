/* 	*****************PROBLEMS on String **************************
					
STATEMENT:
**********************************************************************************
*/

import java.util.*;

class DemoString1
{
	public static void main(String arg[])
	{
		String str1= "Hello";
		
		String str2= new String("Hello");
		
		char Arr[]={'H','e','l','l','o'};
		String str3= new String(Arr);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("String Length is:"+str1.length());// length method
		System.out.println("Array Length is:"+Arr.length);//length property
	}
}