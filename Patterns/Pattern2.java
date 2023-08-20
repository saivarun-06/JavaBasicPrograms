package Patterns;

public class Pattern2
{
	public static void main(String[] args)
	{
		int rows=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=rows;y++)
			{
				if(x==y||x+y==rows+1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}