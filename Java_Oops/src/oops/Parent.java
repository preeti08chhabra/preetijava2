package oops;

public class Parent extends Grandparent
{
	public void features()
	{
		System.out.println("all are same");
	}
	public static void main(String[] args) {
		Parent pt= new Parent();
		pt.family();
		pt.features();
	}
}
