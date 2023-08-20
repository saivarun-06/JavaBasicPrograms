package basicprogramsForloop;

import java.util.Scanner;

public class num1200rev21And1200 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Number");
		int num=sc.nextInt();
		int rem=0,rev=0,count=0,rem1=0,rev1=0,digit=0;;
		for(;num!=0;num/=10)
		{
			rem=num%10;
			//System.out.println(rem);
			rev=rev*10+rem;
			count++;
		}
		System.out.println(count);
		System.out.println(rev);
		for(;rev>0;rev/=10)
		{
			rem1=rev%10;
			digit++;
			rev1=rev1*10+rem1;
		}
		System.out.println(digit);
		System.out.println(rev1);
		count=count-digit;
//		for(int x=1;x<=count;x++)
//		{
//			rev1=rev1*10;
//		}
//		System.out.println(rev1);
		int finalNum=(int)(rev1*(Math.pow(10, count)));
		System.out.println(finalNum);
	}

}
