package com.array;

public class ArDuplicateEx {
	
	public static int duplicateArray(int arr[], int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int temp[] = new int[arr.length];
		int j = 0;
		
		for(int i = 0; i<n-1; i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j++] = arr[n-1];
		for(int i = 0; i<j; i++)
		{
			arr[i] = temp[i];
		}
		return j;
		
	}

	public static void main(String[] args) {
     
		int arr[] = {2,1,4,4,5,6,};
		int n = arr.length;
		
		ArDuplicateEx a1 = new ArDuplicateEx();
		int res = duplicateArray(arr,n);
		
		for(int i = 0; i<res; i++)
		{
			System.out.println(arr[i]);
		}
    
    

	}

}
