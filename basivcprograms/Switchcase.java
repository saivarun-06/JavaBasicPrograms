package basivcprograms;

public class Switchcase 
{
	public static void main(String[] args) 
	{
		char c='*';
		int a=10,b=20;
		switch(c)
		{
			case '+':
			{
				System.out.println(a+b);
				break;
			}
			case '-':
			{
				System.out.println(a-b);
				break;
			}
			case '*':
			{
				System.out.println(a*b);
				break;
			}
			case '/':
			{
				System.out.println(a/b);
				break;
			}
			case '%':
			{
				System.out.println(a%b);
				break;
			}
			default:
				System.out.println("Enter a valid operator");
		}
	}
}
