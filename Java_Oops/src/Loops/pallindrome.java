//To FInd Number is pallindrome
package Loops;

import java.util.Scanner;

public class pallindrome 
{
	public static void main(String[] args) 
	{
		int reversd=0;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter any number");
		int n= sn.nextInt();
		int num=n;
		while(n!=0)								
		{
			int rem = n%10;				
			reversd= reversd*10+rem;	
			n=n/10;						
		}
		if(num==reversd)
		{
			System.out.println("Number is pallindrome");
		}
		else
			System.out.println("Number is not pallindrome");
				
	}
}
