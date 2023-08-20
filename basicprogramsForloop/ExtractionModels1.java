package basicprogramsForloop;

public class ExtractionModels1
{
	public static void main(String[] args)
	{
		int n=121,rem=0,count=0;
		for(;n>0;n/=10)
		{
//			rem=n%10;
			count++;
		}
		System.out.println(count);
	}
}