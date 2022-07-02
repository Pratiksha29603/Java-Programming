/* 	*****************PROBLEMS ON Digit**************************

STATEMENT: Accept number from user and print the reverse order of Digit from that number
			with hardcode values.

INPUT:1215
OUTPUT:5121
*/

class Digit
{
	public static void main(String arg[])
	{
		int iNo=1215, iDigit=0;
		System.out.println("Number is:"+iNo);
		
		iDigit=iNo%10;
		System.out.println("Reverse is:"+iDigit);
		iNo=iNo/10;

		iDigit=iNo%10;
		System.out.println("\t"+iDigit);
		iNo=iNo/10;
		
		iDigit=iNo%10;
		System.out.println("\t"+iDigit);
		iNo=iNo/10;
		
		iDigit=iNo%10; 
		System.out.println("\t"+iDigit);
		iNo=iNo/10;
		
	}
	
}