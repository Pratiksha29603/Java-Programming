import java.scanner.*;
		class Power
	{
		public static void main(String args[])
		{ 
			scanner scn=new Scanner(System.in);
			int num,pow;
			System.out.println("enter power");
			pow=scn.nextInt();
			System.out.println(1<<pow);
		}
	}