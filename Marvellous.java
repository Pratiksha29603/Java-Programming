import java.lang.*;


 class Marvellous
 {
	public static void main(String Arg[])
	{
		System.out.println("Inside main..");
		Arithematic obj1;
		obj1= new Arithematic();
		Arithematic obj2= new Arithematic(21,11);
		int ret=0;
		ret=obj2.Addition();
		System.out.println("Addition is :"+ret);
		ret=obj2.Subtraction();
		System.out.println("Subtraction is:"+ret);
		
	}
 
 }
 
 class Arithematic
{
	public int no1; //characteristics
	public int no2;
	
	Arithematic()  //default constructor
	{
		this.no1=0;
		this.no2=0; 
	} 
	
	Arithematic(int x, int y)  //parameterised constructor
	{
		this.no1=x;
		this.no2=y;
	}
	
	public int Addition()  //behaviour
	{
		int ans=0;
		ans=this.no1 + this.no2;
		return ans;
	}
	
	public int Subtraction()  //behaviour
	{
		int ans=0;
		ans=this.no1 - this.no2;
		return ans;
	}
}
