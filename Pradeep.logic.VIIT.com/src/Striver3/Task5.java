package Striver3;

//  Sort the First K
//  Elements in Ascending Order 
//  and the Remaining Elements in 
//  Descending Order
public class Task5 {

	public void sort(int arr[], int k)
	{
		if (k < arr.length) {
			// for the ascending order
			for (int i = 0; i < k-1; i++) {
				int min = i;
				for (int j = i+1; j < k; j++) {
					if (arr[j] < arr[min]) {
						min = j;
					}
				}
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;

			}

			// for the descending order

			for (int i = k ; i < arr.length; i++) {
				int max = i;
				for (int j = i+1; j < arr.length; j++) {
					if (arr[j] > arr[max]) {
						max = j;
					}
				}
				int temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;

			}
		} else {
			System.out.println("K is greater than length o fthe array");
		}
	}

	
	// for the printing the elements
	public void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	
	public static void main(String[] args) {
		Task5 t = new Task5();
		int arr[] = { 3, 2, 4, 6, 7, 23, 45, 66, 7 };
		t.sort(arr, 4);
		t.print(arr);

	}

}
