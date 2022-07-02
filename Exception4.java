/* 	*****************PROBLEMS ON EXCEPTION HANDLING**************************

STATEMENT:
 
**********************************************************************************
*/


import java.util.Scanner;
class Exception4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter ur age:");
		
		int age=sobj.nextInt();
		
		try
		{
		if(age<18)
		{
			throw new AgeInvalid("age is less than 18");
		}
		}
		catch(AgeInvalid obj)
		{
				System.out.println("Exception occured:"+obj);
		}
		
	}

}
class AgeInvalid extends Exception  //user defined exception
{
	public AgeInvalid(String str)
	{
		super(str);
	}
}