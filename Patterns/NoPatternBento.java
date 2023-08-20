package Patterns;

public class NoPatternBento
{
	public static void main(String[] args) 
	{
		int rows=4;
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>=x;y--)
			{
				System.out.print("  ");
			}
			for(int i=1;i<=x;i++)
			{
				if(i<4)
					System.out.print(i*i+" ");
				else
					System.out.print("0 ");
			}
			for(int z=x-1;z>=1;z--)
			{
				System.out.print(z*z+" ");
			}
			System.out.println();
		}
	}
}


