package Loops;

public class debugging 
{
	public void method1()
	{
	System.out.println("method1 execution");
	}

	public void method2()
	{
	System.out.println("method2 execution");
	}
	public static void main(String[] args) 
	{
		debugging dg= new debugging();
		dg.method1();
		System.out.println("Main method");
		dg.method2();
		System.out.println("All done");
	}
}
