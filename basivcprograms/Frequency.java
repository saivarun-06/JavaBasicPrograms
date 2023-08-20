package basivcprograms;

class Frequency 
{  
	public static void main(String[] args)
	{  
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
		int [] arr1 = new int [arr.length];
        	int visited = -1;  
       	for(int i = 0; i < arr.length; i++)
		{  
           		int count = 1;  
            	for(int j = i+1; j < arr.length; j++)
			{  
                		if(arr[i] == arr[j])
				{  
                    		count++;
                    		arr1[j] = visited;  
                		}  
            	}  
            	if(arr1[i] != visited)  
                	arr1[i] = count;  
        	} 
        	System.out.println(" Element | Frequency");
        	for(int i = 0; i < arr1.length; i++)
		{  
            	if(arr1[i] != visited)  
                	System.out.println("    " + arr[i] + "    |    " + arr1[i]);  
        	}   
    	}
}  
