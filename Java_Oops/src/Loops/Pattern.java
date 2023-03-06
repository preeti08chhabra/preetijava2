package Loops;

public class Pattern 
{
	public static void main(String[] args)
	{
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("");
		
		
		
		
		
		for(int m=5;m>=1;m--)
		{
			for(int n=1;n<=m;n++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(+i);
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			int num=1;
			for(int j=1;j<=i;j++)
			{
			System.out.print(num++);
			}
			
			System.out.println();
		}*/
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
			System.out.print("* ");
			}		
			System.out.println();
		}
	}
}
