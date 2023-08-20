package basivcprograms;
public class palinornot
{
	public static void main(String[] args) 
	{
		int n=111,rem=0,rev=0,temp=0;
		
		for(;n>0;n/=10)
		{
			rem=n%10;
			rev=rev*10+rem;
		}
		if(temp==rev)
			System.out.println("PALIN");
		else
			System.out.println("NOT PALIN");
	}

}
