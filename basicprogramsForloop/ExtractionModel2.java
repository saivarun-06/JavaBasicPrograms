package basicprogramsForloop;

import java.util.Scanner;

public class ExtractionModel2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int rem=0,sum=0,product=1;
		for(;n>0;n/=10)
		{
			rem=n%10;
			if(rem%2==0)
				sum=sum+rem;
			else
				product=product*rem;
		}
		System.out.println(sum+" "+ product);
	}

}
