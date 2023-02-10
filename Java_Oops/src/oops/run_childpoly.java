// run time polymorphism --overriding concept
package oops;

public class run_childpoly extends run_parentpoly

{
	public void sub()
	{
		System.out.println("No addition in child");
	}
	public int sub(int a, int b)
	{
		int d = a/b;
		System.out.println("the value of d  " +d);
		return d;
	}
	public void sub(int a)
	{
		System.out.println("child one");
	}
	public static void main(String[] args)
	{
	
		run_childpoly rc = new run_childpoly();
		rc.sub(20, 5);
		rc.sub(8, 7, 5);
		rc.sub(6);
	}
}
