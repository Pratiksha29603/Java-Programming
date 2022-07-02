/* 	*****************PROBLEMS ON FINAL METHOD**************************

STATEMENT:
 
**********************************************************************************
*/
class FinalMethod2
{
	public static void main(String arg[])
	{
		System.out.println("Inside Main...");
		
		Base bobj=new Derived(); //Upcasting
		bobj.fun();
		FinalMethod2.gun();
	}
	public static void gun()
	{
		final int no=11;
		System.out.println("Inside static gun...");
		no++;
	}
}

class Base
{
	public void fun()
	{
		System.out.println("Inside Base fun...");
	}
	
	public final void gun()
	{
		System.out.println("Inside Base gun...");
	
	}

}

class Derived extends Base
{
	public void fun()  //override
	{
		System.out.println("Inside Derived fun...");
	}
	
	/*
	public void gun()
	{
		System.out.println("Inside Derived gun...");
	}
	*/
}