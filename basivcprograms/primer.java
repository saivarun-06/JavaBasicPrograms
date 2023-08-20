package basivcprograms;

class primer
{
	public static void main(String args[])
	{
		int x,y,count=0;
		for(x=2;x<=100;x++)
		{
			count=0;
			for(y=1;y<=x;y++)
			{
				if(x%y==0)
					count++;
			}
		if(count==2)
			System.out.println(x);
		}
	}
}