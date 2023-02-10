// Compile time polymorphism --Overloading concept
package oops;

public class polymor 
{
 public void add()
 {
	 System.out.println("No addition");
 }
 public void add(int a, int b)
 {
	 int c= a+b;
	 System.out.println(" the value of c " +c);
 }
 public static void main(String[] args) {
	polymor pm = new polymor();
	pm.add();
	pm.add(5, 6);
}
}
