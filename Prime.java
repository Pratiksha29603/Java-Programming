import java.io.*;
	class Prime
	{
		public static void main(String args[])throws IOExeption
		{
			DataInputStream in=new DataInputStream(System.in);
				int n,i;
				System.out.println("enter a no.");
				n=Integer.parseInt(in.readLine());
				for(i=2;i<n;i++)
				{
					if(n%i==0)
					break;
				}
					if(i==n)
					System.out.println(n+"is prime");
					else
					System.out.println(n+"is not prime");
		}
	}