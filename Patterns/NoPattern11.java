package Patterns;

public class NoPattern11
{
	public static void main(String[] args) 
	{
		int rows=5;
		for(int x=rows;x>=1;x--)
		{
			for(int y=x;y<=rows;y++)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		} 
	}
}