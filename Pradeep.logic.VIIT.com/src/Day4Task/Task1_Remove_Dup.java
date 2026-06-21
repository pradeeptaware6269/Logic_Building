package Day4Task;

import java.util.Scanner;

public class Task1_Remove_Dup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Element :");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Here we can simply find the Duplicate Element in the array :");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("The duplicate element is :" + arr[j]);
					
				}
			}
		}

	}
}
