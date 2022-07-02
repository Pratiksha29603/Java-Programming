class Product
{
	int id;
	float price,qua,amt; 
	String Name;
	void setdata()
	{
		id=101;
		Name="mango";
		price=10.0f;
		qua=1000.00f;
	}
	void caldata()
	{
		amt=qua*price;
	}
	void showdata()
	{
		System.out.println("id="+id);
		System.out.println("Name="+Name);
		System.out.println("price="+price);
		System.out.println("qua="+qua);
	    System.out.println("amt="+amt);
	}
	public static void main(String args[])
	{
		Product p1=new Product();
		p1.setdata();
		p1.caldata();
		p1.showdata();
	}
}

