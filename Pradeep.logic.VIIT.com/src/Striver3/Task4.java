package Striver3;

import java.util.Scanner;

//Find the sum of two
// numbers whose product is maximum
public class Task4 {

	public void maxProduct(int arr[]) {
		sort(arr);
		int maxProduct = arr[arr.length - 1] * arr[arr.length - 2];
		System.out.println("The max product of the two element is :" + maxProduct);
	}

	public void sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
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

	public void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {
		Task4 t = new Task4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total Array Ele :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {

			System.out.println("Enter the Element :" + i + " :");
			arr[i] = sc.nextInt();

		}

		t.print(arr);
		t.maxProduct(arr);
		t.print(arr);

	}

}
