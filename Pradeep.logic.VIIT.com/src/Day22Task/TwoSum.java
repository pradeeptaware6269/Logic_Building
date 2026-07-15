package Day22Task;

public class TwoSum {
	;
	public boolean sum(int arr[],int target) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(target == arr[i]+arr[j])
				{
					System.out.println("The position of the Element is :"+arr[i] +" And "+arr[j]+" = "+target);
					return true;
				}
				
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		
		TwoSum t=new TwoSum();
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		boolean result=t.sum(arr, 7);
		if(result)
		{
			System.out.println("The Pair is Found :");
		}
		else
		{
			System.out.println("The Pair is Not Found :");
		}
	}

}
