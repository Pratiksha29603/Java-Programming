import java.util.*;

class Command1
{
	public static void main(String arg[])
	{
		System.out.println("Inside Main...");
		
		if(arg.length==2)
		{
		
			int no1=Integer.parseInt(arg[0]);
			int no2=Integer.parseInt(arg[1]);
			
			int ans= no1+no2;
			
			System.out.println("Addition is:"+ans); //concatination 
		}
	}
}