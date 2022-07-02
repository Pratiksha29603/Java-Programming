import java.util.*;
class Pattern
{
public static void main(String args[])
{ 
 Scanner scn=new Scanner (System.in);
 int n,i,j;
 System.out.println("enter a no");
 n=scn.nextInt();
 for(i=0;i<n;i++)
 { 
  for(j=0;j<=i;j++)
  System.out.print("*");
  System.out.print("\n");
 }
} 
}
