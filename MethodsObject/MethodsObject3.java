package MethodsObject;

public class MethodsObject3
{
	int n,m,rev=0;;
	public int CheckFactor(int n)
	{
		int count=0;
		for(int x=1;x<=n;x++)
		{
			if(n%x==0)
			{
				count++;
			}
		}
		return count;
	}
	public int ReverseNo(int n)
	{
		
		for(;n>0;n/=10)
		{
			int rem=n%10;
			rev=rev*10+rem;
		}
		return rev;
	}
	public String CheckPrime(int n,int m)
	{
		if(CheckFactor(n)==2&&CheckFactor(m)==2)
			return "perfect";
		else
			return "Not Perfect";
	}
	public static void main(String[] args) 
	{
		MethodsObject3 a=new MethodsObject3();
		a.m=13;
		a.n=a.ReverseNo(a.m);
		System.out.println(a.CheckPrime(a.m, a.n));
	}
}