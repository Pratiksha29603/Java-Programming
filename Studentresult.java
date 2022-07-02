import java.util.*;
	class Studentresult
	{
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			int s1,s2,s3,per,tot;
			per=0;
			System.out.println("enter marks of 3 sub");
			s1=scn.nextInt();
			s2=scn.nextInt();
			s3=scn.nextInt();
			if(s1>=40&&s2>=40&&s3>=40)
			{
				tot=(s1+s2+s3);
				per=(tot/3);
		        System.out.println("tot="+tot);
				System.out.println("per="+per);
			}
			if((per>=70)&&(per<100))
			{
				System.out.println("A class");
			}
			else if(per>=60&&per<75)
			{
				System.out.println("B class");
			}
			else
			{
				System.out.println("C class");
			}
			 if((s1>=40)&&(s2>=40)&&(s3<40)||
					(s1>=40)&&(s2<40)&&(s3>=40)||
					(s1<40)&&(s2>=40)&&(s3>=40))
					{
						System.out.println("ATKT");
					}
					else
					{
						System.out.println("Fail");
					}
		}
	}
