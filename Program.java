public class Program
{
	public static void main(String arg[])
	{
		int num=55;
		Calculator.Sub(num);
		System.out.println(" "+num);
		Calculator.Add();
		System.out.println(" "+num);
		Calculator.Show();
	}
}

class Calculator
{
	private static int num=10;
	public static void Reset()
	{
		num=0;
	}
	public static void Add()
	{
		num+=10;
	}
	public static void Sub(int num)
	{
		//num-=5;
	}
	public static void Show()
	{
		System.out.println(" "+num);
	}
}