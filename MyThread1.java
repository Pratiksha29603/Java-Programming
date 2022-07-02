class MyThread1 extends Thread
{
    String msg;
	MyThread1(String msg)
	{
		this.msg=msg;
		start();
	}
	public void run()
	{
	System.out.println(msg);
	}
	public static void main(String args[])
	{
		MyThread1 t1=new MyThread1("how are you???");
		
		MyThread1 t2=new MyThread1("Fine, thank you.....");
	}
}