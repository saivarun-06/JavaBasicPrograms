package arrayprograms;
public class Using1loopsort 
{
	public static void main(String[] args) 
	{
		int x;
		int arr[]=new int[] {10,25,45,89,5,1,3,4,65};
		int temp =0;
		for(x=0;x<arr.length-1;x++)
		{
			if(arr[x]>arr[x+1])
			{
				temp=arr[x];
				arr[x]=arr[x+1];
				arr[x+1]=temp;
				x=-1;
			}
		}
		for(int copy:arr)
			System.out.println(copy);
	}

}
