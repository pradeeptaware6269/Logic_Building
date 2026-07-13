package Day21Task;

import java.util.Arrays;

public class RemoveDuplicate {

	public int moveDuplicate(int arr[]) {

		if (arr.length == 0) {
			return 0;
		}
		int indx = 1;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[i - 1]) {
				arr[indx] = arr[i];
				indx++;
			}
		}
		printArray(arr, indx);
		return indx;
	}

	public void printArray(int arr[], int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {

		RemoveDuplicate r = new RemoveDuplicate();
		int arr[] = { 0, 1, 2, 2, 3, 3, 4, 4, 5, 5 };

		// If the Array is not sorted then ....
		Arrays.sort(arr);
		System.out.println("Before Removing the Duplicate Elements :");
		// r.printArray(arr);
		System.out.println("---------------------");
		r.moveDuplicate(arr);

	}

}
