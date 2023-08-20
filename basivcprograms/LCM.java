package basivcprograms;

public class LCM {

	public static void main(String[] args) 
	{
		int num=10,num1=20,x=2,lcm=0;
		while(x<num&&x<num1)
		{
			if(num%x==0&&num1%x==0)
			{
				lcm=x;
				break;
			}
			x++;
		}
		System.out.println(lcm);
	}

}
