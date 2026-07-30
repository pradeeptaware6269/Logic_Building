package Striver3;

//Debug the descendingSortArray() Function
public class Task6 {
//for the descending order
	public void sortDescending(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int max = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
	}

	
	// for the printing the elements
		public void print(int arr[]) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + ", ");
			}
		}
		
		
	public static void main(String[] args) {

		Task6 t = new Task6();
		int arr[] = { 34, 2, 34, 56, 78 };
		t.sortDescending(arr);
		t.print(arr);

	}
}
