package basivcprograms;

public class Evenoddout
{
	public static void main(String[] args) 
	{
		int n=3;
		System.out.println(n);
		while(n>=1)//(n!=1&&n>0)
		{
			if(n%2==0)
			{
				n=n/2;
			}
			else
			{
				n=(3*n)+1;
			}
			System.out.println(n);
			if(n==1)
			{
				break;
			}
		}
	}
}