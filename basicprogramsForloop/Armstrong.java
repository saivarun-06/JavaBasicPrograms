package basicprogramsForloop;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int x=1,count=0,rem=0,result=0,rev=0,temp=x;
		for(x=1;x<=num;x++)//x=1,x=2
		{
			count=0;//0
			for(;x>0;x/=10)//1>0//2>0
			{
				count++;//1//1
			}
			x=temp;rem=0;
			for(;x>0;x/=10)//1>0//2>0
			{
				rem=x%10;//1%10//2%10
				result=(int)((Math.pow(rem,count)));//1^1//2^1
			}
			x=temp;
			System.out.println(x);
			if(result==x)//1==1/2==2
				System.out.println(x);//1//2	
		}
	}
}