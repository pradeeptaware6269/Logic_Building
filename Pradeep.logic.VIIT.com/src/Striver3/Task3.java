package Striver3;

public class Task3 {
	// selection sort
	public void selection(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	// bubble sort

	public void bubble(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	
	//insertion sort
	public void insertionSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int j=i;
			while(j>0 )
			{
				if(arr[j] < arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				j--;
			}
		}
		
	}

	// print the array

	public void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(" ");
	}

	// check ascending or not
	public void checkAsecending(int arr[]) {
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Asending Order .....");

		}

	}

	public static void main(String[] args) {

		Task3 t = new Task3();
		int arr[] = { 13, 45, 2, 74, 56, 78, 9 };
		
//		System.out.println("------- Selection Sort ------");
//		t.selection(arr);
//		t.print(arr);

//		System.out.println("--------- Bubble Sort ---------");
//		t.bubble(arr);
//		t.print(arr);
//		t.checkAsecending(arr);
		
		System.out.println("------  Insertion sort ------ ");
		t.insertionSort(arr);
		t.print(arr);

	}

}