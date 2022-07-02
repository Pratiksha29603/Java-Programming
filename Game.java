import java.util.*;
class Game
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		char a[][]=new char[4][4];
		int row,col; 
		int k=2,n=1,f=0;
		a[0][0]=48;
		a[0][1]=49;
		a[0][2]=50;
		a[0][3]=51;
		a[1][0]=49;
		a[2][0]=50;
		a[3][0]=51;
		while(n<=9)
		{
			if(n%2==0)
			{
				System.out.println("USER 2:Enter location of symbol i.e.Row &coloum respectively");
				System.out.println("\nBEnter value of row between 1 to 3");
				row=scn.nextInt();
				System.out.println("Enter value of column between 1 to 3");
				col=scn.nextInt();
				a[row][col]='@';
			}
			else
			{
				System.out.println("USER 1:Enter location of symbol i.e.Row &coloum respectively");
				System.out.println("\nEnter value of row between 1 to 3");
				row=scn.nextInt();
				System.out.println("Enter value of column between 1 to 3");
				col=scn.nextInt();
				a[row][col]='$';
			}
			n++;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.print("\n");
		}
		if(a[1][1]=='@'&&a[1][2]=='@'&&a[1][3]=='@'||
		   a[2][1]=='@'&&a[2][2]=='@'&&a[2][3]=='@'||
		   a[3][1]=='@'&&a[3][2]=='@'&&a[3][3]=='@'||
		   a[1][1]=='@'&&a[2][2]=='@'&&a[3][3]=='@'||
		   a[3][1]=='@'&&a[3][2]=='@'&&a[1][3]=='@'|| 
		   a[3][1]=='@'&&a[3][2]=='@'&&a[3][3]=='@'||
		   a[1][1]=='@'&&a[2][1]=='@'&&a[3][1]=='@'||
		   a[1][2]=='@'&&a[2][2]=='@'&&a[3][2]=='@'||
		   a[1][3]=='@'&&a[2][3]=='@'&&a[3][3]=='@')
		{
			f=1;
			break;
		}
		else if(a[1][1]=='$'&&a[1][2]=='$'&&a[1][3]=='$'||
				a[2][1]=='$'&&a[2][2]=='$'&&a[2][3]=='$'||
				a[3][1]=='$'&&a[3][2]=='$'&&a[3][3]=='$'||
				a[1][1]=='$'&&a[2][2]=='$'&&a[3][3]=='$'||
				a[3][1]=='$'&&a[3][2]=='$'&&a[1][3]=='$'|| 
				a[3][1]=='$'&&a[3][2]=='$'&&a[3][3]=='$'||
				a[1][1]=='$'&&a[2][1]=='$'&&a[3][1]=='$'||
				a[1][2]=='$'&&a[2][2]=='$'&&a[3][2]=='$'||
				a[1][3]=='$'&&a[2][3]=='$'&&a[3][3]=='$')
		{
			f=2;
			break;
		}
		else
		{
			f=0;
		}
		}
		if(f==1)
		{
			System.out.println("USER 2 IS WINNER........");
		}
		else if(f==2)
		{
			System.out.println("USER 1 IS WINNER........");
		}
		else
		{
			System.out.println("GAME IS DRAW........");
		}
	}
}