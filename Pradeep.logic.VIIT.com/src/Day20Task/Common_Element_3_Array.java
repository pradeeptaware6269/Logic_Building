package Day20Task;

import java.util.Arrays;

public class Common_Element_3_Array {
	
	public void commonEle(int arr1[],int arr2[],int arr3[]) {
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					for(int k=0;k<arr3.length;k++)
					{
						if(arr1[i]==arr3[k])
						{
							System.out.println("The common Element in the 3 soretd Array is :"+arr1[i]);
						}
					}
				}
			}
		}
		
	}
	
	public void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" , ");
		}
		System.out.print("]");
	}
	public static void main(String[] args) {
		Common_Element_3_Array c=new Common_Element_3_Array();
		
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {11,22,33,44,45,5};
		int arr3[]= {23,45,2,23,5,89};
		
		//c.sort(arr1);  instead of this 
		Arrays.sort(arr1);  // we can also this one 
		System.out.println();
		//c.sort(arr2);
		Arrays.sort(arr1);
		System.out.println();
		//c.sort(arr3);
		Arrays.sort(arr1);
		System.out.println();
		c.commonEle(arr1, arr2, arr3);
	}

}
