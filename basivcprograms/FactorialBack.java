package basivcprograms;

public class FactorialBack 
{

	public static void main(String[] args)
	{
		int n=5;
		int fact =1;
		while(n>=1)//5>=1//4>=1//3>=1//2>=1//1>=1
		{
			fact=fact*n;//1*5=5//5*4=20//20*3=60//60*2=120//120*1=120
			n--;//4//3//2//1//0
		}
		System.out.println(fact);//5//20//60//120//120
	}

}
