// Solve expression using Scanner class ((((x1+x2)+x3)-x4)/x5)*x6)
package oops;

import java.util.Scanner;
public class Exp1scan
{
	public int sum(int a , int b)
	{
		int add = a+b;
		return add;
		}
	public int sub(int a, int b)
	{
		int min = a-b;
		return min;
	}
	public int mul(int a, int b)
	{
		int mult = a*b;
		return mult;
	}
	public int div(int a, int b)
	{
		int divi = a/b;
		return divi;
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of x1");
		int x1= sc.nextInt();
		System.out.println("Enter value of x2");
		int x2=sc.nextInt();
		System.out.println("Enter value of x3");
		int x3=sc.nextInt();
		System.out.println("Enter value of x4");
		int x4=sc.nextInt();
		System.out.println("Enter value of x5");
		int x5=sc.nextInt();
		System.out.println("Enter value of x6");
		int x6=sc.nextInt();				
		Exp1scan es= new Exp1scan();
		int sumresult=es.sum(x1, x2);
		int sumresult2=es.sum(sumresult, x3);
		int subresult=es.sub(sumresult2, x4);
		int divresult=es.div(subresult,x5);
		int mulresult=es.mul(divresult,x6);
		System.err.println("result of Expression ((((x1+x2)+x3)-x4)/x5)*x6): " +mulresult);
	}
}
		
		