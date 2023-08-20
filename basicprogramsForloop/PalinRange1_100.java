package basicprogramsForloop;

import java.util.Scanner;

public class PalinRange1_100 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int x=1,rem=0,rev=0,temp=x;
		for(x=1;x<=num;x++)
		{
			temp=x;rev=0;
			for(int y=x;y>0;y/=10)
			{
				rem=y%10;
				rev=rev*10+rem;
			}
			
			if(temp==rev)
			{
				System.out.println(x);
			}
		}
	}
}