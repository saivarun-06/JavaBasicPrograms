package arrayprograms;
public class binsrh 
{
	public static void main(String[] args) 
	{
		  int arr[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		  int low=0,high=arr.length-1,mid=0,search=60;
		  while(low<=high)
		  {
			  mid=(low+high)/2;
			  if(arr[mid]<search)
				  low=mid+1;
			  else if(arr[mid]>search)
				  high=mid-1;
			  else
			  {
				  System.out.println("ELEMENT FOUND");
			  	break;
			  }
			  if(low>high)
				  System.out.println("ELEMENT NOT FOUND");
		  }
	}
}