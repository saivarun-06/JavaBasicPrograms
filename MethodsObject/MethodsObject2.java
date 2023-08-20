package MethodsObject;

public class MethodsObject2 
{
	int n;
	public int CheckLarge(int n)
	{
		int max=0;
		for(;n>0;n/=10)
		{
			int rem=n%10;
			if(max<=rem)
				max=rem;
		}
		return max;
	}
	public int checkFactors(int n)
	{
		int val=CheckLarge(n);
		int s=0;
		for(int x=val-1;x>=1;x--)
		{
			if(val%x==0)
			{
				s=x;
				break;
			}
		}
		return s;
	}
	public static void main(String[] args) 
	{
		MethodsObject2 m=new MethodsObject2();
		m.n=81754;
		System.out.println(m.checkFactors(m.n));
		
	}
}