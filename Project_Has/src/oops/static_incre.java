//Use of Variable with Static
package oops;

public class static_incre 
{
	static int a=5;
	
	
	public static void add()
	{
		
				System.out.println("Addition is possible");
		
	}
	public void incre()
	{
		add();
		static_incre.add();
		static_incre in= new static_incre();
		in.add();
		this.add();
		a= a+1;
	}
	public static void main(String[] args) 
	{
		static_incre in= new static_incre();
		in.incre();
		/*System.out.println("The value of a after 1st increment = " +in.a);
		static_incre in1= new static_incre();
		in1.incre();
		System.out.println("The value of a after 2nd increment = " +in1.a);
		static_incre in2= new static_incre();
		in2.incre();
		System.out.println("The value of a after 3rd increment = " +in2.a);
		static_incre.add();
		System.out.println("the value is " +static_incre.a);*/
	}
}
