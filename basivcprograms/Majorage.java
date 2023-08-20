package basivcprograms;

public class Majorage {

	public static void main(String[] args) 
	{
		int age = 59;
		if(age>18)
		{
			if(age>50)
				System.out.println("Senior Citizen");
			else
				System.out.println("Major");	
		}
		else
			System.out.println("Minior");
	}
}