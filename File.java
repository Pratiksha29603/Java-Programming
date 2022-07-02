/*
**********************PROBLEMS ON String ************************************
						in C
STATEMENT:  Write C program which Create the file 
				
Input :  
Output : 
**********************************************************************************
*/
//import java.io.*;
import java.util.*;
import java.io.File;  
class File
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);         //object of Scanner class  
		System.out.print("Enter the file name: ");  
		String name=sc.nextLine();              //variable name to store the file name  
		FileOutputStream fos=new FileOutputStream(name, true);  // true for append mode 
	
		if(fd==-1)
		{
			System.out.println("Unable to create the file\n");
		}
		else
		{
			System.out.println("file Succesfully created\n");
		}
	
	
	}

}

/*
#include<stdio.h>

#include<unistd.h>
#include<io.h>
 int main()
 {
	int fd=0;
	char Fname[30];
	
	printf("Enter File Name\n");
	scanf("%s",Fname);
	fd=creat(Fname,0777); // 0 owner, group, other
	
	if(fd==-1)
	{
		printf("Unable to create the file\n");
	}
	else
	{
		printf("file Succesfully created\n");
	}
	
 
	return 0;
 }
 */