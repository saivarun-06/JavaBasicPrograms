package basivcprograms;

public class GCD 
{
	public static void main(String[] args) 
	{
		int num = 12 , num1 = 6,x=2,gcd=0;;
		while(x<=num&&x<=num1)
		{
			if(num%x==0&&num1%x==0)
			{
				gcd=x;
			}
			x++;
		}
		System.out.println(gcd);
	}
}