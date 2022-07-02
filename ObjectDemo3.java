/* 	*****************PROBLEMS ON OBJECT CLASS**************************
					
STATEMENT: getClass()
**********************************************************************************
*/
class ObjectDemo3
{
	public static void main(String arg[])
	{
		Demo obj1=new Demo("Pratiksha","PPA");
		Demo obj2=new Demo("Sai","Python");
	
		System.out.println("Hashcode of obj1 is :"+obj1.hashCode());
		System.out.println("Hashcode of obj2 is :"+obj2.hashCode());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		Class cobj=obj1.getClass();
		System.out.println("Name of Class is :"+cobj.getName());
	}
}

class Demo
{
	public String Name;
	public String Batch;
	
	public Demo(String x, String y)
	{
		this.Name=x;
		this.Batch=y;
	}
	public String toString()
	{
		return this.Name+" "+this.Batch;
	}
	
}