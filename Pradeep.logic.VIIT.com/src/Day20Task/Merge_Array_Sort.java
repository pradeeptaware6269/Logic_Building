package Day20Task;
/*
 
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Explanation: The arrays we are merging are [1,2,3] and [2,5,6].

The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 
 */
public class Merge_Array_Sort {
	
	public void array(int arr1[],int arr2[],int m,int n)
	{
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		
		while(i>=0 && j>=0)
		{
			if(arr1[i]>arr2[j])
			{
				
			arr1[k]=arr1[i];
			i--;
			}
			else
			{
				arr1[k]=arr2[j];
				j--;
			}
			k--;
		}
		
		System.out.print("[ ");
		
		for(i=0;i<arr1.length;i++)
		{
		System.out.print(arr1[i] +" , ");
		}
		
		System.out.println(" ] ");
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,0,0,0};
		int arr2[]= {2,5,6};
		
		int m=3;
		int n=3;
		
		Merge_Array_Sort m1=new Merge_Array_Sort();
		m1.array(arr1, arr2, m, n);
		
	}

}
