interface I11
{
	void setval(int p,int q, int r);
}
interface I22 extends I11
{
	void show();
}
class c11 implements I22,I11
{
	int a,b,c;
	public void setval(int p, int q , int r)
	{
		a=p;
		b=q;
		c=r;
	}
	public void show()
	{
		if(a<b && a<c)
		System.out.println("smallest no is:-"+a);
		else if(b<c)
		System.out.println("smallest no is:-"+b);
		else
		System.out.println("smallest no is:-"+c);
	}
}
class Mp
{
	public static void main(String args[])
	{
		c11 c=new c11();
		c.setval(5,3,11);
		c.show();
	}
}