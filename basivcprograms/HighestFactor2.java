package basivcprograms;

public class HighestFactor2 
{
	public static void main(String[] args) 
	{
		int n=12,i=1,temp=0;
		while(i<n)
		{
			if(n%i==0)
			{
				temp=i;
			}
		i++;
		}
		System.out.println(temp);
	}
}