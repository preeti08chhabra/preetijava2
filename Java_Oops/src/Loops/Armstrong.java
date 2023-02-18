//To FInd Number is Armstrong
package Loops;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		int result =0;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter any number");
		int n= sn.nextInt();
		int num=n;							
		while(num!=0)
		{
			int rem= num%10;
			result = result + rem * rem * rem;
			num=num/10;
		}
		
		if(n==result)
		{
			System.out.println("Number is Armstrong");
		}
		else 
			System.out.println("Number is not Armstrong");
		
	}
}
