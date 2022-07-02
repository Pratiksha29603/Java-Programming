/* 	*****************PROBLEMS ON Unnamed block**************************

STATEMENT:
 
**********************************************************************************
*/

import java.util.*;

class UnnamedBlock
{
	public static void main(String arg[])
	{5
		Demo obj1=new Demo();
		Demo obj2=new Demo(110,220);
		Demo obj3=new Demo(20202);
	}
}

class Demo
{
	public int i,j;
	public static int x,y;
	
	{
		System.out.println("Inside unnamed block");
		i=10;
		j=20;
		//common logic
	}
	
	public Demo()
	{
		System.out.println("Inside default constructor");
	}
	
	public Demo(int a,int b)
	{
		System.out.println("Inside parameterised constructor");
		System.out.println(a);
		System.out.println(b);
		
	}
	public Demo(int k)
	{
		System.out.println("Inside single parameterised  constructor");
		System.out.println(k);
	}
	
	static
	{
		System.out.println("Inside static block");
		x=10;
		y=20;
	}
}