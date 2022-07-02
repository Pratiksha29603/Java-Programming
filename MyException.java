import java.io.*;
class MyException extends Exception
{
	MyException(String m)
	{
		super(m);
	}
}
class TestDemo
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("enter any no");
			int n=Integer.parseInt(br.readLine());
			if(n<0)
			{
				throw new MyException("negative no");
			}	
				else
			{	
				throw new MyException("positive no");
			}
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}