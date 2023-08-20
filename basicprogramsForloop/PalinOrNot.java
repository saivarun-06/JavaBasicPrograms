package basicprogramsForloop;

import java.util.Scanner;

public class PalinOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int rem=0,rev=0,temp=num;
		for(;num>0;num/=10)
		{
			rem=num%10;
			rev=rev*10+rem;
		}
		if(rev==temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
