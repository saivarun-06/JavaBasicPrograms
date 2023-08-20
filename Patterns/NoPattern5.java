package Patterns;

public class NoPattern5
{
	public static void main(String[] args) 
	{
		int rows=5,count=1;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(x==rows||y==1||x==y)
				{
					System.out.print(count+" ");
					count++;
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