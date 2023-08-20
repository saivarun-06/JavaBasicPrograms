package Patterns;

public class NoPattern10
{
	public static void main(String[] args) 
	{
		int rows=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(y==1||x==y)
					System.out.print(x+" ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
		for(int x=4;x>=1;x--)
		{
			for(int y=1;y<=x;y++)
			{
				if(y==1||x==y)
					System.out.print(x+" ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}
}