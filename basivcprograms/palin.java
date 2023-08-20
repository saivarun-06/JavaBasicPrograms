package basivcprograms;

class palin
{
	public static void main(String args[])
	{
		int x=1511,rem=0,rev=0,temp=x;
		for(;x>0;x/=10)
		{
			rem=x%10;
			rev=rev*10+rem;
		}
		x=temp;
		if(x==rev)
			System.out.println("PALIN");
		else
			System.out.println("NOT PALIN");
	}
}
		