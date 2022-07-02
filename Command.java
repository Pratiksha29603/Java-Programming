import java.util.*;

class Command
{
	public static void main(String arg[])
	{
		System.out.println("Inside Main...");
		
		System.out.println("Enter Number of Arguments:"+arg.length);
		
		System.out.println("Command Line Arguments are :");
		for(int i=0; i<arg.length;i++)
		{
			System.out.println(arg[i]);
		}
	}
}