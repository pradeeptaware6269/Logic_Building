package Day4Task;

import java.util.Scanner;

public class Task5_Array_rotate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the array Element " + i + " :");
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the ,how many indexs do want to the Rotate It :");
		int k = sc.nextInt();
		int j = 0;
		for (int i = 0; i < k; i++) {
			int temp = arr[j];
			for (j = 0; j < n; j++) {
				arr[i] = arr[i + 1];

			}
			arr[n - 1] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

}
