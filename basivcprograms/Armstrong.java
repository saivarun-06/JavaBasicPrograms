package basivcprograms;

class Armstrong
{
	public static void main(String args[])
	{
		int x=1,y=1000,z=1,count=0,rem=0,power=1,temp=x,sum=0;
		for(;x<=y;x++)
		{
			rem=0;x=temp;count=0;
			for(;x>0;x/=10)
			{
				count++;
			}
			x=temp;sum=0;
			for(;x>0;x/=10)
			{
				rem=x%10;
				power=1;sum=0;
				for(x=1;x<=count;x++)
				{
					power=power*rem;
					sum=sum+power;
				}
			
			}
		}	
		x=temp;
		if(x==sum)
			System.out.println(sum);
	}
}	
