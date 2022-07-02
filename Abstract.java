/* 	*****************PROBLEMS ON abstract**************************

STATEMENT:
 
**********************************************************************************
*/

import java.util.*;

class Abstract
{
	public static void main(String arg[])
	{
		//Demo obj=new Demo();//NA
		Demo obj; //Allowed
		obj=new Hello(); //upcasting
		obj.fun(); //fun of hello
		obj.gun(); //gun of Demo
		obj.sun(); //sun of hello
		System.out.println(obj.i); //10
		System.out.println(obj.j); //20
	}
}

abstract class Demo
{
	public int i,j;
	public Demo()
	{
		System.out.println("inside constructor");
		i=10;
		j=20;
	}
	
	public void fun()
	{
		System.out.println("inside fun of Demo");
	}
	public void gun()
	{
		System.out.println("inside gun of Demo");
	}
	public abstract void sun();
}

class Hello extends Demo
{
	public int x,y;
	public Hello()
	{
		System.out.println("inside constructor of hello");
	}

	public void fun()  //overriding
	{
		System.out.println("inside fun of hello");
	}
	
	public void sun()  //Defination
	{
		System.out.println("inside sun of hello");
	}
}