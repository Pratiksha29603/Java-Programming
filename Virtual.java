class Virtual
{
	public static void main(String arg[])
	{
		Base bp = new  Derived();	//upcasting
		bp.fun(); //derived fun 
		bp.gun(); //base gun
		//bp.sun();
	}

}

class Base
{
	public void fun()
	{
		System.out.println("Base Fun");
	}
	
	public void gun()
	{
		System.out.println("Base gun");
	}


}

class Derived extends Base
{
	public void fun() //overriding
	{
		System.out.println("Derived Fun");
	}
	
	public void sun() 
	{
		System.out.println("Derived sun");
	}
	
}