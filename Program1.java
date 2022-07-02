import java.util.*;

class Program1
{
	public static void main(String arg[])
	{
		Person p=new Trainee();
		p.Hello();
	}
}
class Person
{
	public void Hello()
	{
		System.out.println("Hello Person");
	}
}
class Emp extends Person
{
	public  void Hello()
	{
		System.out.println("Hello Emp");
	}
}
class Trainee extends Emp
{
	public void Hello()
	{
		System.out.println("Hello trainee");
	}
}