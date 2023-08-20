package Patterns;

public class HelPattern 
{
	public static void main(String[] args) 
	{
		int rows=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>=x;y--)
			{
				System.out.print("  ");
			}
			for(int i=1;i<=x;i++)
			{
				System.out.print("* ");
			}
			for(int z=x-1;z>=1;z--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}