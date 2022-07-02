import java.util.*;
 
 class Design
 {
	public staict void main(String arg[])
	{
		Singleton sobj= Singleton();
		Singleton sobj= Singleton.GetObject();
	}
 }
 
 
 class Singleton
 {
	public int x,y;
	
	private static Singleton obj= new Singleton();
	
	private Singleton()
	{
		System.out.println("Inside Constructor");
	}
 
	public static Singleton GetObject()
	{
		return obj;
	}	
 }