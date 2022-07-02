interface I11
{
	void setval(int p,int q);
}
interface I22 extends I11
{
	void show();
}
class c11 implements I22
{
	int a,b,c;
	public void setval(int p, int q)
	{
		a=p;
		b=q;
	}
	public void show()
	{
		int i;
		c=1;
		for(i=1;i<=b;i++)
		{
			c=c*a;
		}
		System.out.println(" "+a+"^"+b+"="+c);
	}
}
class IntEx2
{
	public static void main(String args[])
	{
		c11 c=new c11();
		c.setval(5,3);
		c.show();
	}
}