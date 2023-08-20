package basicprogramsForloop;

import java.util.Scanner;

public class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int rem=0,x=1,fact=1,sum=0,temp=num;
		for(;num>0;num/=10)
		{
			rem=num%10;
			fact=1;
			for(x=1;x<=rem;x++)
			{
				fact=fact*x;
			}
			sum=sum+fact;
		}
		num=temp;
		if(sum==num)
		{
//			System.out.println(num);
//			System.out.println(sum);
			System.out.println("Strong Number");
		}
		else
		{
//			System.out.println(num);
//			System.out.println(sum);
			System.out.println("Not a Strong Number");
		}
			
	}

}
