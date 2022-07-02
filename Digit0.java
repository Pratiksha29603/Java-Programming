import java.util.*;
public class Digit0
{
		public int GetSum(int iValue1, int iValue2)
	{
		int iSum=0;
		int iDigit1=0;
		int iDigit2=0;
		
		while((iValue1!=0)&&(iValue2!=0))
		{
			iDigit1=iValue1%10;
			iDigit2=iValue2%10;
			
			iSum=iSum+(iDigit1*iDigit2);
			
			iValue1=iValue1/10;
			iValue2=iValue2/10;
		}
	}
	
	public static void main(String arg[])
	{
		Scanner S=new Scanner(System.in);
		
		System.out.println("Enter First no:");
		int iNo1=S.nextInt();
		
		System.out.println("Enter Second no:");
		int iNo2=S.nextInt();
		Digit0 d=new Digit0();
		
		int iRet=d.GetSum(iNo1,iNo2);
		System.out.println("Addition of digit"+iRet);
	}
}