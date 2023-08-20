package Patterns;

public class Pattern8 
{
	public static void main(String[] args)
	{
		int rows=4,val=65;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=rows;y++)
			{
				if(x%2==0)
					System.out.print("# ");
				else
				{
					System.out.print((char)val+" ");
					val++;
				}
			}
			System.out.println();
		}
	}
}