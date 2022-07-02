/* 	*****************PROBLEMS on String **************************
					
STATEMENT:
**********************************************************************************
*/

import java.util.*;

class DemoString2
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
		
		String s1="Demo";// String Literals
		String s2="Demo";
		String s3="Demo";
		
		String s4= new String("Demo"); //String Objects
		String s5= new String("Demo");
		String s6= new String("Demo");
		
		for(int j=0;j<s6.length();j++)
		{
			System.out.println(s6.charAt(j));
		}
		
		char Brr[]=s6.toCharArray();
		for(int i=0;i<Brr.length;i++)
		{
			System.out.println(Brr[i]);
		}
	}
}