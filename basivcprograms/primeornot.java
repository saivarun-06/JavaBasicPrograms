package basivcprograms;
import java.util.Scanner;
public class primeornot
{
	public static void main(String[] args) 
	{
		int x,y,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		x= sc.nextInt();
		for(y=2;y<x;y++)
		{
			if(x%y==0)
			{
				count++;
				break;
			}	
		}
		if(count==0)
			System.out.println("PRIME");
		else
			System.out.println("NOT PRIME");
	}
}