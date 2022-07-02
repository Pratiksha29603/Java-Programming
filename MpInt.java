interface I1
{
	void setval(int p,int q);
	void show();
}
class c1 implements I1
{
	int a,b,add;
	public void setval(int p, int q)
	{
		a=p;
		b=q;
	}
	public void show()
	{
		add=a+b;
		System.out.println("add="+add);
	}
}
class MpInt
{
	public static void main(String args[])
	{
		c1 c=new c1();
		c.setval(30,35);
		c.show();
	}
}