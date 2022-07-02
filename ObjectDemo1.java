/* 	*****************PROBLEMS ON OBJECT CLASS**************************
					
STATEMENT: hashCode()
**********************************************************************************
*/
class ObjectDemo1
{
	public static void main(String arg[])
	{
		Demo obj1=new Demo("Pratiksha","PPA");
		Demo obj2=new Demo("Sai","Python");
	
		System.out.println("Hashcode of obj1 is :"+obj1.hashCode());
		System.out.println("Hashcode of obj2 is :"+obj2.hashCode());
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
	
}