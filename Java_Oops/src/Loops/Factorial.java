package Loops;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int fact=1;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter number to get factorial");
		int num=sn.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.printf("Factorial of %d = %d", num, fact);
	}
}
