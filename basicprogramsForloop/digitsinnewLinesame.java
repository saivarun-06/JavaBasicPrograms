package basicprogramsForloop;

import java.util.Scanner;

public class digitsinnewLinesame 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int rem=0,rev=0,rem1=0,rev1=0;
		for(;num>0;num/=10)
		{
			rem=num%10;
			rev=rev*10+rem;	
		}
		//System.out.println(rev);
		for(;rev>0;rev/=10)
		{
			rem1=rev%10;
			System.out.println(rem1);
		}
	}
}