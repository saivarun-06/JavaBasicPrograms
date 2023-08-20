package basivcprograms;

public class Leapyears 
{
	public static void main(String[] args) 
	{
		int year=1900,year1=2023;
		while(year<=year1)
		{
			if(year%4==0&&year%100!=0 || year%400==0)
			{
				System.out.println(year);
			}
			year++;
		}
	}
}