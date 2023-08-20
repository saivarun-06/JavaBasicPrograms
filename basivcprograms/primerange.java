package basivcprograms;
public class primerange 
{
	public static void main(String[] args) 
	{
		int x,count=0;
			System.out.println("PRIME NUMBERS BETWEEN 1 TO 100 ARE ");
		for(int y=2;y<=100;y++)
		{
			count=0;
			for(x=1;x<=y;x++)
			{
				if(y%x==0)
					count++;
			}
			if(count==2)
				System.out.print(y+" ");
		}
	}

}
