package Patterns;

public class NoPattern4
{
	public static void main(String[] args)
	{
		int rows=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(x==rows||y==1||x==y)
				{
					System.out.print(x+" ");
				}
				else
				{
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}

}
