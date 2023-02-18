package Loops;

import java.util.Scanner;

public class swapping 
{
	public void swap(int x, int y)
	{
		int temp;
		temp= x;
		x=y;
		y=temp;
		System.out.println("the values after swapping--" +x+"  "+y);
	}
	public static void main(String[] args) 
	{
		swapping sp=new swapping();
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a= sn.nextInt();
		System.out.println("Enter value of b");
		int b =sn.nextInt();
		System.out.println("The values before swapping--" +a+"   "+b);
		sp.swap(a,b);
	}
}
