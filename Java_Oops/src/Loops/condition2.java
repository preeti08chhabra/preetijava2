//using loop into condition and vice versa
package Loops;

import java.util.Scanner;

public class condition2 
{
	public static void main(String[] args)
	{
		System.out.println("Enter number");
		Scanner sn= new Scanner(System.in);
		int num = sn.nextInt();
		if(num>2)
		{
			for(int i=2;i<=num;i++)
			{
				if(i%2==0)
				System.out.println(num+"*"+i+"="+num+i);
			}
		}
	}
}
