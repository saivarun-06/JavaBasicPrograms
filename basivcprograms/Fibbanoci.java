package basivcprograms;

public class Fibbanoci 
{
	public static void main(String[] args) 
	{
		int n=10,x=0,y=1,z,s=1;
		System.out.println(x);
		System.out.println(y);
		while(s<=n)
		{
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
			s++;
		}		
		
	}
}