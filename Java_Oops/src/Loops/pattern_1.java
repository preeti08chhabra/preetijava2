package Loops;

public class pattern_1 
{
public static void main(String[] args) 
{
	int rowcount=5;
	for( int i=0;i<=rowcount;i++) //outer loop row
	{
		for(int j=i;j<=rowcount-1;j++)
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println(); //moving cursor to next line
	}
	
}
}
