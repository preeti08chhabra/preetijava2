//Use of Variable without Static
package oops;

public class increment 
{
	int a=5;
	public void incre()
	{
		a= a+1;
	}
	public static void main(String[] args) 
	{
		increment in= new increment();
		in.incre();
		System.out.println("The value of a after 1st increment = " +in.a);
		increment in1= new increment();
		in1.incre();
		System.out.println("The value of a after 2nd increment = " +in1.a);
		increment in2= new increment();
		in2.incre();
		System.out.println("The value of a after 3rd increment = " +in2.a);
	}
}
