import java.io.*;
class MyException extends Exception
{
	MyException(String m)
	{
		super(m);
	}
}
class TestDemo3
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("enter a age");
			int age=Integer.parseInt(br.readLine());
			if(age<18)
			{
				throw new MyException("person is able");
			}	
				else
			{	
				throw new MyException("person is unable");
			}
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}