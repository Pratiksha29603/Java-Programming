class Stud
{
	int rn;
	float fees; 
	String Name,cname;
	void setdata()
	{
		rn=101;
		Name="rohan";
		fees=10000.00f;
		cname="java";
	}
	void showdata()
	{
		System.out.println("rn="+rn);
		System.out.println("Name="+Name);
		System.out.println("fees="+fees);
		System.out.println("cname="+cname);
	}
	public static void main(String args[])
	{
		Stud s1=new Stud();
		s1.setdata();
		s1.showdata();
	}
}

 