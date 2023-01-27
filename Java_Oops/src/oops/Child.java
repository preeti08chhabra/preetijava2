package oops;

public class Child extends Grandparent
{
public void members()
	{
		System.out.println("we are 4 members");
	}
	public static void main(String[] args) {
		Child ch = new Child();
		ch.members();
		ch.family();
	}
}
