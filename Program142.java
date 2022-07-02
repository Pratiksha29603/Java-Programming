/***********************PROBLEMS ON Number ************************************
					
STATEMENT: Accept the number from user and check whether the number is Armstrong 
			or not
**********************************************************************************
*/
import java.util.*;

class Program142
{
	public static void main(String arg[])
	{
		System.out.println("Inside Main");
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0;
		boolean bRet=false;
		
		System.out.println("Enter Number:");
		iValue=sobj.nextInt();
		Marvellous mobj=new Marvellous();
		
		bRet=mobj.CheckArmstrong(iValue);
		if(bRet==true)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}	
	}
}
class Marvellous
{
	public boolean CheckArmstrong(int iNo)
	{
		int iDigCnt=0, iTemp=0, iDigit=0, iPower=1, 
		iCnt=0, iSum=0;
		
		if(iNo<0)
		{
			iNo=-iNo; // Updator
		}
		
		iTemp=iNo;
		
		while(iTemp!=0)	// to count digit in number
		{
			iDigCnt++;		
			iTemp=iTemp/10;
		}
		
		iTemp=iNo;
		
		while(iTemp!=0)
		{
			iDigit= iTemp%10;
			for(iCnt=1; iCnt<=iDigit; iCnt++)
			{
				iPower=iPower*iDigit;
			}
			iSum=iSum+iPower;
			iPower=1; //reset ipower
			iTemp=iTemp/10;
		}
		
		if(iSum==iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

