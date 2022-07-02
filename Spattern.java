import java.io.*;
	 class Spattern
	 {
		public static void main(String args[])throws IOException
		{
			DataInputStream in=new DataInputStream(System.in);
			String st;
			System.out.println("enter a string");
			st=in.readLine();
			string st1=" ";
			for(int i=0;i<st.length;i++)
			{
				char b=st.charAt(i);
				System.out.println(" "+b);
			}
		}
	 }