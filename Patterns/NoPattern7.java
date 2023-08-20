package Patterns;

public class NoPattern7
{
	public static void main(String[] args) 
	{
		int rows =4,count=1;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}