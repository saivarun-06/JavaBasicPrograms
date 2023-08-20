package arrayprograms;
public class maxindele
{
	public static void main(String[] args) 
	{
		int max=0;
		int arr[]=new int[] {155,10,250,46,210,5,8};
		for(int x=0;x<arr.length;x++)
		{
			if(arr[max]<arr[x])
				max=x;
		}
		System.out.println(max);
		System.out.println(arr[max]);
	}
}