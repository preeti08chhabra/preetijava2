// Use of If , Else If ladder
package Loops;

import java.util.Scanner;

public class condition 
{
 
	  public static void main(String[] args)
 {
	 System.out.println("Enter value of a ");
	Scanner sn= new Scanner(System.in);
	int a = sn.nextInt();

	if (a%2==0)
		System.out.println("Number is even");
	else
		System.out.println("Number is odd");
	 System.out.println("Enter value of marks ");
	int m= sn.nextInt();
	if ((m>=80)&&(m<=100))
	System.out.println("Merit -->" +m );
	else if ((m>=60)&&(m<80))
		System.out.println("First Divison -->" +m );
	else if ((m>=40)&&(m<60))
		System.out.println("Second Division -->" +m );
	else if ((m>=0)&&(m<40))
		System.out.println("Fail -->" +m );
	else 
		System.out.println("Wrong Entry -->" +m );
	 }
}
