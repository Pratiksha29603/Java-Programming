class Table 
{
	void printtable(int n)
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(n*i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Mythread extends Thread
{
	Table t;
	Mythread(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printtable(5);
	}
}
class Mythread1 extends Thread
{
	Table t;
	Mythread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printtable(10);
	}
}
class Threaddemo
{
	public static void main(String args[])
	{
		Table obj=new Table();
		Mythread t1=new Mythread(obj);
		Mythread1 t2=new Mythread1(obj);
		t1.start();
		t2.start();
	}
}