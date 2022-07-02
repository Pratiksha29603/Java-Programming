class MyThread extends Thread
{
    String msg;
	MyThread(String msg)
	{
		This.msg=msg;
	}
	public void run()
	{
	System.out.println(msg);
	}
	public static void main(String args[])
	{
		MyThread t1=new MyThread("how are you???");
		MyThread t2=new MyThread("Fine, thank you.....");
		t.start();
	}
}