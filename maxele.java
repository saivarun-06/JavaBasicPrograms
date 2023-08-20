package arrayprograms;
public class maxele 
{
	public static void main(String[] args) 
	{
		int [] arr=new int [] {155,1020,25,45,60,445};
		int max=arr[0];
		for(int x=1;x<arr.length;x++)
		{
			if (max<arr[x])
				max=arr[x];
		}
		System.out.println(max);
	}
}