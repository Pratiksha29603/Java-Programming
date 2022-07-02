/* 	*****************PROBLEMS ON STATIC **************************

STATEMENT:
 
**********************************************************************************
*/

class StaticDemo
{

	public static void main(String arg[])
	{
		System.out.println("Value of static j:"+Demo.j);   //20                      
		
		Demo.gun();//20
		
		Demo obj=new Demo();
		obj.fun();
		obj.gun();
		
		System.out.println("Value of non static i:"+obj.i);
		
		System.out.println("Value of static j:"+obj.j);
	}
}

class Demo
{
	public int i=10;
	public static int j=20;
	
	public void fun()
	{
		System.out.println("Inside non static fun");
		System.out.println(i);
		System.out.println(j);
		
	}
	
	public static void gun()
	{
		System.out.println("Inside static gun");
		//System.out.println(i); // static method cannot access Non static characteristics
		System.out.println(j);
	}
}