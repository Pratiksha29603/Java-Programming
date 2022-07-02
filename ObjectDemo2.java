/* 	*****************PROBLEMS ON OBJECT CLASS**************************
					
STATEMENT:toString()
**********************************************************************************
*/
class ObjectDemo2
{
	public static void main(String arg[])
	{
		Demo obj1=new Demo("Pratiksha","PPA");
		Demo obj2=new Demo("Sai","Python");
	
		System.out.println("Hashcode of obj1 is :"+obj1.hashCode());
		System.out.println("Hashcode of obj2 is :"+obj2.hashCode());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
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