import java.lang.*;
class Customer
{
	int amt=10000;
	pubic void run()
	{ 
	
	synchronized void withdraw(int amt)
	{
		System.out.println("Going to withdraw");
		if(this.amt<amt)
		{
			System.out.println("Less balance waiting for deposite");
			try
			{
				wait();
			}
			catch(Exception e)
			{
			
			}
			this.amt-=amt;
			System.out.println("Withdraw completed");
		}
	}
		synchronized void deposite(int amt)
		{
			System.out.println("Going to deposite");
			this.amt+=amt;
			System.out.println("Deposite sucessfully");
			notify();
		}
	}
}
class Test extends Thread
{
	public static void main(String args[])
	{
		final Customer c=new Customer();
		Thread t = new Thread();
		t.start();
		
			
			
		
	
		
					
		
	}
}