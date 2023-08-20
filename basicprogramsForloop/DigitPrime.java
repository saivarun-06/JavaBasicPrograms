package basicprogramsForloop;

import java.util.Scanner;

public class DigitPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Number");
		int num= sc.nextInt();
		int rem=0,rev=0,x=1,count=0;
		for(;num>0;num/=10)
		{
			count=0;
			rem=num%10;
			for(x=1;x<=rem;x++)
			{
				if(rem%x==0)
				{
					count++;	
				}	
			}
			if(count==2)
				System.out.println(rem);
		}
	}
}