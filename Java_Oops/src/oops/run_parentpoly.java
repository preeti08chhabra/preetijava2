// run time polymorphism --overriding concept --PArent 
package oops;

public class run_parentpoly 
{
	public void sub()
	{
		System.out.println("no subtraction");
	}
	public void sub(int a, float b)
	{
		float c = a- b;
		System.out.println("the value of c  " +c);
	}
	public int sub(int a, int b, int c)
	{
		int d = a*b+c;
		System.out.println("the value of d  " +d);
		return d;
	}
	public static void main(String[] args) {
		run_parentpoly rp = new run_parentpoly();
		rp.sub();
		rp.sub(5, 6);
		rp.sub(8, 5, 4);
	}
}
