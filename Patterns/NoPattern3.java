package Patterns;

public class NoPattern3
{
	public static void main(String[] args) 
	{
		int rows =4,count=1;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(count<=9)
				{
					System.out.print(count+" ");
				}
				else if(count>=9)
				{
					System.out.print("0 ");
				}
				count++;
			}
			System.out.println();
		}
	}
}