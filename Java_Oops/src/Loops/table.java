package Loops;

import java.util.Scanner;

public class table
{
	public static void main(String[] args) 
	{
		int i=1;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter any number to print table");
		int num= sn.nextInt();
		System.out.println("Table is");
		while(i<=10)
		{
						
			System.out.println(num+" * "+i+" = "+num*i);  
			i++;
		}
	}
}
