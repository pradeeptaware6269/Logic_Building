package Day33;

import java.util.Scanner;

public class Task6 {

	public boolean sorted(int[] arr, int n) {

	    for (int i = 0; i < n - 1; i++) {

	        if (arr[i] > arr[i + 1]) {
	            return false;
	        }

	    }

	    return true;
	}

	public static void main(String[] args) {
		Task6 t = new Task6();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total No array Element :");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the Array ELements  :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(t.sorted(arr, n));
	}

}
