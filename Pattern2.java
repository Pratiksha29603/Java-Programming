import java.util.*;
class Pattern2
{
public static void main(String args[])
{ 
 Scanner scn=new Scanner (System.in);
 int n,i,j,k;
 System.out.println("enter a no");
 n=scn.nextInt();
 for(i=0;i<n;i++)
 { 
  for(j=0;j<=i;j++)
  {
  System.out.print(" ");
  }
  for(k=0;k<i;k++)
    System.out.print(" *");
  System.out.println("\n");
 }
 }
 }