package basicprogramsForloop;

public class HighestPrimefactor
{
	public static void main(String[] args) 
	{
		int num=20,x,count=0,Fact=0;
		for(x=1;x<=num;x++)
		{
			if(num%x==0)//15%3//15%4//15%5
			{
				count=0;
				for(int y=2;y<x;y++)
				{
					if(x%y==0)//3%1==0//5%1==0
						count++;//2
				}
				if(count==0)
					Fact=x;	
			}
		}
		System.out.println(Fact);
	}
}