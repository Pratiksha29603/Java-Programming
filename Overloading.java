import java.lang.*;



class Overloading
{
	public static void main(String arg[])
	{
		System.out.println("Inside main");
		Demo obj;
		obj= new Demo();
		
		System.out.println("Addition of 2 Integer:"+obj.Add(10,11));
		System.out.println("Addition of 2 float:"+obj.Add(10.20f,11.25f));
	}

}

class Demo
{
	//Overloading by changing the datatype
	
	public int Add(int no1, int no2)
	{
		System.out.println("Inside First Add");
		return no1+no2;
	}
	
	public float Add(float no1, float no2)
	{
		System.out.println("Inside Second Add");
		return no1+no2;
	}
}