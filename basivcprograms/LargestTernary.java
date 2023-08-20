package basivcprograms;

public class LargestTernary {

	public static void main(String[] args)
	{
		int a=40,b=20,c=30;
//		int x=a>b?a:b;
//		int y=x>c?x:c;
//		System.out.println(y);
		//System.out.println((a>b)?(a>c?a:c):(b>c)?b:c);
		if(a>b&&a>c)
		{
			System.out.println(a);
		}
		else if(b>c)
		{
			System.out.println(b);
		}
		else
			System.out.println(c);
	}

}
