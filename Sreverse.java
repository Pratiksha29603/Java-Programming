import java.io.*;
class Sreverse
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		StringBuffer st=new StringBuffer();
		System.out.println("Enter a string");
		st.append(in.readLine);
		st.reverse();
		System.out.println("Reverse of a string="+st);
	}
}