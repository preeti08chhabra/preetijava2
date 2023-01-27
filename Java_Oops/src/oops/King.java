package oops;

public class King {

	public void m2()
	{
		System.out.println("I am king");
	}
	public static void main(String[] args) {
		Queen q=new Queen(); //has a relationship
		q.m1();
		King k = new King();
		k.m2();
		
	}
}
