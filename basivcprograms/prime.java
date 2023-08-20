package basivcprograms;

class prime
{
	public static void main(String args[])
	{
		int x,y,count=0;
		{
			for(x=2;x<5;x++)
			{
				if(5%x==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println("PRIME");
			else
				System.out.println("NOT PRIME");
		}
	}
}