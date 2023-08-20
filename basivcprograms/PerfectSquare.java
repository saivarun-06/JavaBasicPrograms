package basivcprograms;

public class PerfectSquare 
{
	public static void main(String[] args) 
	{
		int a=25;
		int d= (int)Math.sqrt(a);
		if(d*d==a)//if(d==(int)d)
		{
			System.out.println("perfect Square");
		}
		else
		{
			System.out.println("Not A perfect Square");
		}
	}
}