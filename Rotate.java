import java.util.*;
	class Rotate
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
				int a[];
				int n,temp,k,i;
				System.out.println("enter no.of element in list");
				n=scn.nextInt();
				a=new int[n];
				System.out.println("enter no. of rotation");
				k=scn.nextInt();
				for(i=0;i<n;i++);
				{
					a[i]=scn.nextInt();
					System.out.println(a[i]);
				}
					for(i=0;i<k;i++)
					{
						temp=a[n-1];
						for(int j=n-1;j>0;j--)
						{
							a[j]=a[j-1];
						}
							a[0]=temp;
					}
		}
	}