package arrayprograms;
public class minindele 
{
	public static void main(String[] args) 
	{
		int min=0;
		int arr[]=new int[] {10,25,555,6,23};
		for(int x=0;x<arr.length;x++)
		{
			if (arr[min]>arr[x])
				min = x;
		}
		System.out.println(arr[min]);
	}
}