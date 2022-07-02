class SuperDemo
{
	public static void main(String arg[])
	{
		Derived dobj=new Derived();
		dobj.gun();		
	}

}

class Base
{
	public int x,y;
	public Base(int a, int b)
	{
		System.out.println("Base Constructor");
		this.x=a;
		this.y=b;
	}
	
	public void fun()
	{
		System.out.println("Base Fun");
	}

}

class Derived extends Base
{
		public int a,b;
		public Derived()
		{
			super(11,21);  //use 1
			System.out.println("Derived Constructor");
		}
		
		public void gun()
		{
			System.out.println("the value of x:"+super.x); //use2
			super.fun(); //use3
		}
}