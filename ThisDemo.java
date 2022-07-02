class ThisDemo
{
	public static void main(String arg[])
	{
			Demo obj=new Demo(10,20);
	}

}

class Demo
{
	public int x,y;
	
	public Demo()
	{
	
		//this(10,20);
		System.out.println("Default Constructor");
	}
	public Demo(int a,int b)
	{
		this();
		System.out.println("Parametrised Constructor");
		this.x=a;
		this.y=b;
	}
	public void fun()
	{
		System.out.println("Inside Fun");
		System.out.println("Value of X:"+this.x);
	}
	
	public void gun()
	{
		System.out.println("Inside gun");
		this.fun();
	}
}