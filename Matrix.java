import java.util.*;
	class Matrix
	{
		public static void main(String args[])throws IOExeption
		{
			DataInputStream in=new DataInputStream(System.in);
			int a[][]=new int[3][3];
			int i,j;
			System.out.println("enter 9 element in 3*3 matrix");
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						a[i][j]=Integer.parseInt(in.readLine());
					}
				}
				System.out.println("array element");
					for(i=0;i<3;i++)
					{
						for(j=0;j<3;j++)
						{
							System.out.println(" "+a[i][j]);	
						}
						System.out.println( );
					}
						
		}
	}

















 