import java.lang.*;
class Inheritance
{
	public static void main(String arg[])
	{
		System.out.println("Inside main");
		
		Base bobj= new Base();
		bobj.fun();
		
		Derived dobj=new Derived();
		dobj.gun();
		dobj.fun();
	}
}

class Base
{
	public int x;
	public int y;
	
	public Base()
	{
		System.out.println("Inside Default Base constructor");
		this.x=0;
		this.y=0;
	}
	
	public Base(int i,int j)
	{
		System.out.println("Inside Base constructor");
		this.x=i;
		this.y=j;
	}
	
	public void fun()
	{
		System.out.println("Inside Base fun");
		
	}
	
}	

class Derived extends Base  // class Derived:public Base
{
	public int a,b;
	
	public Derived()
	{
		System.out.println("Inside Default Derived Constructor");
		this.a=0;
		this.b=0;
	}
	
	public Derived(int no1,int no2)
	{
		System.out.println("Inside Parameterised Derived Constructor");
		this.a=no1;
		this.b=no2;
	}
	
	public void gun()
	{
		System.out.println("Inside Derived gun");
		
	}
}
