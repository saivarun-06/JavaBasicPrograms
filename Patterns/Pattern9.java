package Patterns;

public class Pattern9 
{
	public static void main(String[] args)
	{
		int rows =4;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=rows;y++)
			{
				if(y==1||y==rows||x==1||x==rows)
					System.out.print("0 ");
				else
					System.out.print(y*y+" ");
			}
			System.out.println();
		}
	}
}