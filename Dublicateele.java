//DUBLICATE ELEMENTS IN AN ARRAY IS REMOVING



package arrayprograms;
public class Dublicateele
{
	public static void main(String[] args) 
	{
		int x,y;
		int a[]= {1,2,3,1,2,4,5,8};
		boolean b[]=new boolean[a.length];
		for(x=0;x<a.length;x++)
		{
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y]&&x!=y)
				{
					b[y]=true;
				}
			}
			if(b[x]==false)
				System.out.println(a[x]);
		}
	}
}