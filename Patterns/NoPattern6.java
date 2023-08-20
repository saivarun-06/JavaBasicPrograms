package Patterns;

public class NoPattern6
{
	public static void main(String[] args) 
	{
		int rows=5;int count=1;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(x==rows||y==1||x==y)
				{
					System.out.print(count+" ");
				}
				else
				{
					System.out.print("# ");
				}
				count++;
			}
			System.out.println();
		}
	}
}