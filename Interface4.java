 /* 	*****************PROBLEMS ON INTERFACE**************************

STATEMENT one class can implements more than one interfaces 
**********************************************************************************
*/ 
import java.util.*;

class Interface4
{
	public static void main(String arg[])
	{
		System.out.println("");
		
		Marvellous mobj=new Marvellous();
		mobj.gun();
		mobj.fun(11);
		mobj.fun();
		System.out.println("Value of i from Hello1:"+Hello1.i);
		System.out.println("Value of i from Hello2:"+Hello2.i);
	
	}
}

interface  Hello1
{
	int i=10;
	void fun();
	void gun();
}

interface  Hello2
{
	int i=20;
	void fun(int no);
}

class Marvellous implements Hello1,Hello2 //5
{
	public void fun()
	{
		System.out.println("Inside fun");
	}
	
		public void gun()
	{
		System.out.println("Inside gun");
	}
	
	public void fun(int no)
	{
		System.out.println("Inside fun with integer");
	}

}