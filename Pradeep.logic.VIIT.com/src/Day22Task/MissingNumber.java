package Day22Task;

import java.util.HashSet;

/*Input: nums = [3,0,1]
for
Output: 2

*/
public class MissingNumber {

	public void number(int arr[])
	{
		int n=arr.length;
		HashSet<Integer> set=new HashSet<Integer>();
		for (Integer num : arr) {
			set.add(num);
		}
		for(int i=1;i<n;i++)
		{
			if(!set.contains(i))
			{
				System.out.println("The Given Element is found "+i);
				return;
			}
		}
		
	}
		public void number1(int arr[])
		{
			int missing=0;
			int actual=0;
			int expected=0;
			int n=arr.length;
			for(int i=0;i<n;i++)
			{
				actual=actual+arr[i];
			}
			expected=n*(n+1)/2;
			missing=actual - expected;
			
			System.out.println("The Missing Number is : "+missing);
				
		}
		
		public void number2(int arr[]) {
			int min=arr[0];
			int n=arr.length;
			int max=arr[n-1];
			
			HashSet<Integer> h=new HashSet<Integer>();
			for (Integer integer : arr) {
				h.add(integer);	
			}
			
			for(int i=min;i<=max;i++)
			{
				if(!(h.contains(i)))
				{
					System.out.println("The element is Found here : "+ i);
				}
			}
			
		}
	
	public static void main(String[] args) {
		
		MissingNumber m=new MissingNumber();
		int arr[]= {1,2,3,5,6,7,8};
		//m.number(arr);
		//m.number1(arr);
		m.number2(arr);
	}
}
