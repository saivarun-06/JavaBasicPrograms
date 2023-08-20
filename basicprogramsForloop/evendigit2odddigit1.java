package basicprogramsForloop;

import java.util.Scanner;

public class evendigit2odddigit1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rem=0,rev=0,rem1=0;
		for(;num>0;num/=10)
		{
			rem=num%10;
			rev=rev*10+rem;
		}
		for(;rev>0;rev/=10)
		{
			rem1=rev%10;
			System.out.print((rem1%2==0?rem1+2:rem1+1));
//			if(rem1%2==0)
//			{
//				rem1=rem1+2;
//				System.out.print(rem1);
//			}
//			else
//			{
//				rem1=rem1+1;
//				System.out.print(rem1);
//			}
		}	
	}
}