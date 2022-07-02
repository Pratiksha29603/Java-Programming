import java.io.*;
	class Abc
	{
		public static void main(String args[])throws IOException
		{
			DataInputStream in=new DataInputStream(System.in);
			char ch;
			System.out.println("enter a char");
			ch=(char)System.in.read();
			if(character.isLetter(ch))
			{
				if(character.isUppercase(ch))
				{
					System.out.println("is capital letter"+ch);
				}
				else
				{
					System.out.println("is small letter"+ch);
				}
				if(character.isDigit(ch))
				{
					System.out.println("is num val"+ch);	
				}
				else
				{
					System.out.println("sp char"+ch);
				}
			}
		}
	}