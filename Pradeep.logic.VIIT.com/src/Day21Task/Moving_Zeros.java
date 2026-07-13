package Day21Task;

public class Moving_Zeros {

	
	public void move(int arr[]) {
		
		int indx=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] !=0)
			{
				arr[indx]=arr[i];
				indx++;
			}
			
		}
		
		while(indx < arr.length)
		{
			arr[indx]=0;
			indx++;
		}
		
		pritnArray(arr);
	}
	
	public void pritnArray(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		Moving_Zeros m= new Moving_Zeros();
		
		int arr[]= {1,2,0,9,8,7,0,0,23,44};
		System.out.println("Before The Zeros At the End : ");
		m.pritnArray(arr);
		System.out.println("After the moving the Zeros At the End  :");
		m.move(arr);
		
	}
}
