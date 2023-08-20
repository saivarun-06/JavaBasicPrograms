package basivcprograms;

public class FizzBuzz 
{
	public static void main(String[] args) 
	{
		int n=15;
		if(n%3==0&&n%5==0)
			System.out.println("FizzBuzz");
		else if(n%3==0)
			System.out.println("Buzz");
		else if(n%5==0)
			System.out.println("Fizz");
		else
			System.out.println(n);
	}
}