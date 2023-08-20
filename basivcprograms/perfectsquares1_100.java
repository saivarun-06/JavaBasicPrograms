package basivcprograms;

public class perfectsquares1_100 
{
	public static void main(String[] args) 
	{
		int num=1,num1=100;
		while(num<=num1)//for(num=1;num<=num1;num++)
		{
			int d=(int)Math.sqrt(num);
			if(d*d==num)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}