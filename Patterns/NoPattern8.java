package Patterns;

public class NoPattern8
{
	public static void main(String[] args)
	{
		int rows =4;
		for(int x=1;x<=rows;x++)
		{
			for(int y=x;y>=1;y--)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		for(int x=3;x>=1;x--)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}