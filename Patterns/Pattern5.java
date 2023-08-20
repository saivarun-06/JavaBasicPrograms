package Patterns;

public class Pattern5 {

	public static void main(String[] args)
	{
		int rows=5;
		for(int x=1;x<=rows;x++)
		{
			int val=65;
			for(int y=1;y<=rows;y++)
			{
				if(y%2==0)
					System.out.print("# ");
				else
					System.out.print((char)val+" ");
				val++;
			}
			System.out.println();
		}
	}
}