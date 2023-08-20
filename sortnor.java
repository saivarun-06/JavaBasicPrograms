package arrayprograms;
public class sortnor 
{
	public static void main(String[] args) 
	{
		int x,y;
		int arr[]=new int[] {10,5,2,7,8,94,65,121,1,35};
		for(x=0;x<arr.length;x++)
		{
			for(y=x+1;y<arr.length;y++)
			{
				if  (arr[x]>arr[y])
				{
					arr[x]=arr[x]+arr[y];
					arr[y]=arr[x]-arr[y];
					arr[x]=arr[x]-arr[y];
				}	
			}
		}
		for(int temp:arr)
			System.out.println(temp);
	}
}