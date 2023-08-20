package arrayprograms;
public class minele 
{
	public static void main(String[] args)
	{
		int x;
		int arr[]=new int[] {150,25,120,10,48,5};
		int min=arr[0];
		for( x=1;x<arr.length;x++)
		{
			if(min>arr[x])
				min=arr[x];
		}
		System.out.println(min);
	}

}
