package Patterns;

public class NoPattern1
{
	public static void main(String[] args) 
	{
		int rows =4;
		for(int x=1;x<=rows;x++)
		{
			for(int y=x;y>=1;y--)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}