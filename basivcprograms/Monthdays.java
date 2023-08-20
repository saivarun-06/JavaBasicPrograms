package basivcprograms;

public class Monthdays {

	public static void main(String[] args)
	{
		int m=2,year=2024;
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
		{
			System.out.println("No of Days = 31");
		}
		else if(m==2)
		{
			if(year%4==0&&year!=100 ||year%400==0)
			{
				System.out.println(year + " is a leap year");
				System.out.println("no of days = 29");
			}
			else
			{
				System.out.println(year + " is not a leap year");
				System.out.println("no of days = 28");
			}
		}
		else
		{
			System.out.println("No of Days = 30");
		}
	}

}
