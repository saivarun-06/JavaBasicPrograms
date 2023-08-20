package MethodsObject;

public class MethodsObject1
{
	int a,b;
	public int countPrimes(int a)
	{
		int count=0;
		for(int x=1;x<=a;x++)
		{
			if(a%x==0)
			{
				count++;
			}
		}
		return count;
	}
	public void checkPrime(int a,int b)
	{
		if(countPrimes(a)==2&&((b==a+2)||(b==a-2)))
		{
				int digit=0;
				for(int x=1;x<=b;x++)
				{
					if(b%x==0)
					{
						digit++;
					}
				}	
				if(digit==2)
					System.out.println("TwinPrimes");
		}
	}
	public static void main(String[] args) 
	{
		MethodsObject1 m=new MethodsObject1();
		m.checkPrime(11, 13);
	}
}