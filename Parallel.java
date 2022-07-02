/* 	*****************PROBLEMS ON MULTITHREADING**************************

STATEMENT: Parallel execution
Input : 
Output : 
**********************************************************************************
*/


import java.lang.*;

class Parallel
{
	public static void main(String arg[]) throws Exception
	{
		System.out.println(" thread name is:"+Thread.currentThread().getName());
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		
		obj1.setName("First");
		obj2.setName("Second");
		
		obj1.start();
		obj2.start();
		
		obj1.join();
		obj2.join();
		System.out.println("End of main...");
	}
}

class Demo extends Thread
{
	//Logic
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		  try
		  {
			Thread.sleep(100); //100 miliseconds spleeping time of thread 
			System.out.println("Inside:"+Thread.currentThread().getName()+":"+i);
		  }
		  catch(Exception obj)
		  {}
		}
	}
}

