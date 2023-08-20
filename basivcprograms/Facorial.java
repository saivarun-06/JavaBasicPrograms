package basivcprograms;

public class Facorial 
{
	public static void main(String[] args) 
	{
		int n = 5,i=1,fact = 1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}