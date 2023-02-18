package Loops;

import java.util.Scanner;

public class fibnocci
{
	 public static void main(String[] args) 
	{
		 int result;
		 Scanner sn= new Scanner(System.in);
		 System.out.println("Enter count for  which u want Series ");
		 int count = sn.nextInt();
		 int a= 0;
		 int b=1;
		 for(int i=0; i<=count;i++)
		 {
			 result= a+b;
			 System.out.println(""+result);
			 a=b;
			 b=result;
			 
		 }
		 
	}
} 
