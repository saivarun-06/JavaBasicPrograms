package Patterns;

public class NoPattern9 
{
	public static void main(String[] args) 
	{
		int rows=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>rows-x;y--)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}