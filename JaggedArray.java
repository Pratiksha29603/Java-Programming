
import java.util.*;
class JaggedArray
{
	public static void main(String arg[])
	{
		int i=0;
		int j=0;
		int iSize=0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the size of Row of array:");
		iSize = sobj.nextInt();
		int arr[][] = new int [iSize][];
		
		System.out.println("Enter the element");
		
		
		arr[0]=new int[iSize];
		for(i=0; i<iSize; i++)
		{
			for(j=0; j<arr[i].length; j++)
			{
					System.out.println(arr[i][j]);
			}
		}
		
		arr[1]=new int[iSize];
		arr[2]=new int[iSize];
	}
}	