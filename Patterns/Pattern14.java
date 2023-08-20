package Patterns;

public class Pattern14 
{
	public static void main(String[] args) 
	{
		int rows=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(y%2==0)
					System.out.print("$ ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}
}