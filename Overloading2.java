import java.lang.*;
class Overloading2
{
	public static void main(String arg[])
	{
		System.out.println("Inside main");
		Demo obj;
		obj= new Demo();
		int iRet=0;
		float fRet=0.0f;
		
		iRet=obj.Add(10,11);
		System.out.println("Addition of 2 Integer:"+iRet);
		
		fRet=obj.Add(10.20f,11.25f);
		System.out.println("Addition of 2 float:"+fRet);
		
		iRet=obj.Add(10,11,30);
		System.out.println("Addition of 3 Integer:"+iRet);
		
		obj.fun(10,11.3f);
		obj.fun(11.3f,10);
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
	
	public int Add(int no1, int no2, int no3)
	{
		System.out.println("Inside third Add");
		return no1+no2+no3;
	}	
		
	 public void fun(int i,float f)
	{
		System.out.println("Inside first fun");
	}
	
	 public void fun(float f , int i)
	{
		System.out.println("Inside Seconf fun");
	}
	
	
}