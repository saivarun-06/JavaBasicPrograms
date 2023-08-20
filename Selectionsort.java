package arrayprograms;
public class Selectionsort 
{
	public static void main(String[] args) 
	{
		int min=0,x,y=0,temp=0;
		int arr[]=new int[] {10,25,555,6,23};
		for(x=0;x<arr.length;x++)
		{
			min=y;
			for(y=0;y<arr.length;y++)
			{
				if(arr[x]>arr[x+1])
				{
					temp=arr[min];
					arr[x]=arr[x+1];
					arr[y]=temp;
					x=-1;
				}
			}
		}
		for(int copy:arr)
			System.out.println(arr[x]);
	}
}
