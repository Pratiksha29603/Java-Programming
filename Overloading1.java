import java.lang.*;
class Overloading1
{
	public static void main(String arg[])
	{
		System.out.println("Inside main");
		Demo obj;
		obj= new Demo();
		int iRet=0;
		float fRet=0.0f;
		
		iRet=obj.Add(10,11);
		fRet=obj.Add(10.20f,11.25f);
		System.out.println("Addition of 2 Integer:"+iRet);
		System.out.println("Addition of 2 float:"+fRet);
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