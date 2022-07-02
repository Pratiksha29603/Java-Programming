import java.io.*;
	class Vowel
	{
		public static void main(String args[])
		{
			DataInputStream in=new DataInputStream(System.in);
			char ch;
			System.out.println("enter a char");
			ch=(char)(in.readLine());
			switch(ch)
			{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				System.out.println("char is vowel");
				break;
				default:
				System.out.println("char is consonent");
				
			}
		}
	}