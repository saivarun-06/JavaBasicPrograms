package basivcprograms;

class Fibinocci
{
	public static void main(String args[])
	{
		int n1=0,n2=1,n3,count=10;
		System.out.println(n1+" "+n2);
		for(int x=2;x<count;x++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
		