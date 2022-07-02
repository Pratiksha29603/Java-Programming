/* 	*****************PROBLEMS **************************
					
STATEMENT: Addition of 2 Number inside main.
**********************************************************************************
*/
import java.util.*;

class Program138
{
	public static void main(String arg[])
	{
		System.out.println("Inside Main");
		Scanner sobj=new Scanner(System.in);
		int iNo1=0, iNo2=0, iAns=0;
		
		System.out.println("Enter First Number:");
		iNo1=sobj.nextInt();
		
		System.out.println("Enter Second Number:");
		iNo2=sobj.nextInt();
		
		iAns=iNo1+iNo2;
		System.out.println("Addition is:"+iAns);	
	}
}

