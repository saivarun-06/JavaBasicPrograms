package basicprogramsForloop;

public class Factors1_10 
{
	public static void main(String[] args) 
	{
		int x=1,y=1,count=0;
		for(x=1;x<=10;x++)
		{
			System.out.print(y+" Factors are : ");
			count=0;
			for(y=1;y<=x;y++)
			{
				if(x%y==0)
				{
					count++;
					System.out.print(y+" ");
				}	
			}
			if(count==2)
				System.out.println(y);
			System.out.print( "count is : " +count+" ");
			System.out.println();
		}
	}
}