package basicprogramsForloop;

import java.util.Scanner;

public class LargestDigitofnum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int rem=0,sum=0;
		for(;n>0;n/=10)
		{
			rem=n%10;
			
		}	
	}
}