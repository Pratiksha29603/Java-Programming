/* 	*****************PROBLEMS **************************
					
STATEMENT: Addition of 2 Number using function.
**********************************************************************************
*/
import java.util.*;

class Program139
{
	public static int Addition(int i, int j)
	{
		int iResult=0;
		
		iResult=i+j;
		return iResult;
	}
	
	public static void main(String arg[])
	{
		System.out.println("Inside Main");
		Scanner sobj=new Scanner(System.in);
		int iNo1=0, iNo2=0, iRet=0;
		
		System.out.println("Enter First Number:");
		iNo1=sobj.nextInt();
		
		System.out.println("Enter Second Number:");
		iNo2=sobj.nextInt();
		
		iRet=Addition(iNo1,iNo2);
		System.out.println("Addition is:"+iRet);	
	}
}

