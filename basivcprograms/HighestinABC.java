package basivcprograms;

public class HighestinABC
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30;
		if(a<b)//10<20d
		{
			a=a+b;//30
			b=a-b;//10
			a=a-b;//20
		}
		if(a<c)//20<30
		{
			a=a+c;//50
			c=a-c;//20
			a=a-c;//30
		}
		if(b<c)//10<30
		{
			b=b+c;//40
			c=b-c;//10
			b=b-c;//30
		}
		System.out.println("a= " +a+"b= "+b+"c= "+c);
	}
}
