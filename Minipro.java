import java.util.*;
class Minipro
{
	public static void main(String args[])
	{
		char a[][]=new char[3][3];
	    int f=0,n=1,loc;
		char c;
		System.out.println("\t\t\t1  2  3\n"+
			               "\t\t\t4  5  6\n"+
		                   "\t\t\t7  8  9");
		System.out.println("SYMBOLS:Player 1:-@\tPlayer 2:-$");
		Scanner scn=new Scanner(System.in);
		while(n<=9)
		{
			if(n%2==0)
			{
				System.out.println("\"Player 2:\"Enter location for player 2");
				loc=0;
				loc=scn.nextInt();
				c='$';
				
				switch(loc)
				{
					case 1:
						a[0][0]=c;
						/*if(=)
						{
							System.out.println("Location is already filled plz enter another location");
							continue;
						}*/
						
					break;
					case 2:
						a[0][1]=c;
						
					break;
					case 3:
						a[0][2]=c;
						
					case 4:
						a[1][0]=c;
						
					break;
					case 5:
						a[1][1]=c;
						
					break;
					case 6:
						a[1][2]=c;
						
					break;
					case 7:
						a[2][0]=c;
						
					break;
					case 8:
						a[2][1]=c;
						
					break;
					case 9:
						a[2][2]=c;
						
					break;	
					default:
						System.out.println("Plz enter valied location");
					break;					
				}
				
			}
			else
			{
				System.out.println("\"Player 1:\"Enter location for player 2");
				loc=0;
				loc=scn.nextInt();
				c='@';
				
				switch(loc)
				{
					case 1:
						a[0][0]=c;
						
					break;
					case 2:
						a[0][1]=c;
						
					break;
					case 3:
						a[0][2]=c;
						
					case 4:
						a[1][0]=c;
						
					break;
					case 5:
						a[1][1]=c;
						
					break;
					case 6:
						a[1][2]=c;
						
					break;
					case 7:
						a[2][0]=c;
						
					break;
					case 8:
						a[2][1]=c;
						
					break;
					case 9:
						a[2][2]=c;
						
					break;	
					default:
						System.out.println("Plz enter valied location");
					break;					
				}
				
			}
			n++;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print("  "+a[i][j]);	
				}
				System.out.println("\t\t\t");
			}
			if(a[0][0]=='@'&&a[0][1]=='@'&&a[0][2]=='@'||
		    a[1][0]=='@'&&a[1][1]=='@'&&a[1][2]=='@'||
		  	a[2][0]=='@'&&a[2][1]=='@'&&a[2][2]=='@'||
		   	a[0][0]=='@'&&a[1][0]=='@'&&a[2][0]=='@'||
		  	a[0][1]=='@'&&a[1][1]=='@'&&a[2][1]=='@'|| 
		  	a[0][2]=='@'&&a[1][2]=='@'&&a[2][2]=='@'||
		  	a[0][0]=='@'&&a[1][1]=='@'&&a[2][2]=='@'||
		  	a[0][2]=='@'&&a[1][1]=='@'&&a[2][0]=='@')
			{
				f=1;
				break;
				
			}
			else if(a[0][0]=='$'&&a[0][1]=='$'&&a[0][2]=='$'||
		 	a[1][0]=='$'&&a[1][1]=='$'&&a[1][2]=='$'||
		  	a[2][0]=='$'&&a[2][1]=='$'&&a[2][2]=='$'||
		   	a[0][0]=='$'&&a[1][0]=='$'&&a[2][0]=='$'||
		  	a[0][1]=='$'&&a[1][1]=='$'&&a[2][1]=='$'|| 
		  	a[0][2]=='$'&&a[1][2]=='$'&&a[2][2]=='$'||
		  	a[0][0]=='$'&&a[1][1]=='$'&&a[2][2]=='$'||
		  	a[0][2]=='$'&&a[1][1]=='$'&&a[2][0]=='$')
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
			System.out.println("USER 1 IS WINNER........");
		}
		else if(f==2)
		{
			System.out.println("USER 2 IS WINNER........");
		}
		else
		{
			System.out.println("GAME IS DRAW........");
		}
	}
}