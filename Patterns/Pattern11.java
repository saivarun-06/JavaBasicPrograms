package Patterns;

public class Pattern11 
{
	public static void main(String[] args) 
	{
		int rows=4;
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>=x;y--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}