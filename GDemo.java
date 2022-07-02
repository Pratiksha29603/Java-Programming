import java.util.*;
class GDemo 
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		GDemo g=new GDemo();
		char a[][]=new char [3][3];
		int flag=0,n=0,loc,f=0;
		System.out.println("\t\t\t1  2  3\n"+
			               "\t\t\t4  5  6\n"+
		                   "\t\t\t7  8  9");
		System.out.println("SYMBOLS:Player 1:-@\tPlayer 2:-$");
		while(n<9)
		{
			if(n%2!=0)
			{
				System.out.println("\"Player 1:\"Enter location for player 1\"");
				loc=scn.nextInt();
				switch(loc)
				{
					case 1:
						if(a[0][0]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
						}
						a[0][0]='@';
						
					break;

					case 2:
						if(a[0][1]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
						}
						a[0][1]='@';
					break;
					
					case 3:
						
						/*if(a[0][2]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
						}*/
						a[0][2]='@';
					break;

					case 4:
						
						if(a[1][0]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
					
						}
						a[1][0]='@';
					break;

					case 5:
						
						if(a[1][1]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
							
						}
						a[1][1]='@';
					break;

					case 6:
						
						if(a[1][2]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
							
						}
						a[1][2]='@';
					break;

					case 7:
						
						if(a[2][0]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
						}
						a[2][0]='@';
					break;

					case 8:
						
						if(a[2][1]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
						}
						a[2][1]='@';
					break;

					case 9:
						
						if(a[2][2]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
						}
						a[2][2]='@';
					break;	
				
					default:
						System.out.println("Plz enter valied location");
					break;					

				}
				n++;
			}
			else
			{
				System.out.println("\"Player 2:\"Enter location for player 2\"");
				loc=scn.nextInt();
				/*if(flag==1)
				{
					System.out.println("Location is already filled plz enter another location");
				}*/
				switch(loc)
				{
					case 1:
						
						if(a[0][0]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
							
						}
						a[0][0]='$';
					break;

					case 2:
						
						if(a[0][1]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
							
						}
						a[0][1]='$';
					break;


					case 3:
						
						if(a[0][2]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
							
							
						}
						a[0][2]='$';
					break;

	
					case 4:
						
						if(a[1][0]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
							
						}
						a[1][0]='$';
					break;


					case 5:
						
						if(a[1][1]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
							
						}
						a[1][1]='$';
					break;


					case 6:
						
						if(a[1][2]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
							
						}
						a[1][2]='$';
					break;


					case 7:
						
						if(a[2][0]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
							
						}
						a[2][0]='$';
					break;
	

					case 8:
						
						if(a[2][1]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
						
						}
						a[2][1]='$';
					break;


					case 9:
						
						if(a[2][2]!=' ')
						{
							System.out.println("Location is already filled plz enter another location");
							
						}
						a[2][2]='$';
					break;
				
					default:
						System.out.println("Plz enter valied location");
					break;					

				}
				n++;
			}
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
