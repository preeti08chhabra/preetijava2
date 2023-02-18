//To FInd Number is Prime
package Loops;

import java.util.Scanner;

public class prime 
{
	public static void main(String[] args) 
{
		int Flag =0;
	Scanner sn = new Scanner(System.in);
	System.out.println("Enter any number");
	int num = sn.nextInt();
	for(int i=2;i<num;i++)    // we can make number half to reduce complexity
	{
		if(num%i==0)
		Flag=1;
		
	}
	
	if (Flag == 0)
		System.out.println("is a prime number." +num);
	   
	  else
		  System.out.println("is a not prime number." +num);
		
}
}
