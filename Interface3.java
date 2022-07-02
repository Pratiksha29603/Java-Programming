/* 	*****************PROBLEMS ON INTERFACE**************************

STATEMENT:
 
**********************************************************************************
*/ 
import java.util.*;

class Interface3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter radius:");
		float value=sobj.nextFloat();
		Marvellous mobj=new Marvellous();
		float fRet=0.0f;
		
		fRet=mobj.area(value);
		System.out.println("Area is :"+fRet);
		
		fRet=mobj.circumference(value);
		System.out.println("circumference is :"+fRet);
		
		System.out.println("Value of PI:"+Circle.PI);
		//Circle.PI=6.14f; //Error
	}
}

interface Circle
{
	float PI=3.14f; // public, abstract,final
	float area(float radius); //public , abstract
	float circumference(float radius);	
}
class Marvellous implements Circle
{
	public float area(float radius)
	{
		float ret=0.0f;
		ret=PI*radius*radius;
		return ret;
	}
	
	public float circumference(float radius)
	{
		float ret=0.0f;
		ret=2*PI*radius;
		return ret;
	}
}