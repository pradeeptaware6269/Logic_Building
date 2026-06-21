package Day3Task;


import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentSum = 0;
		int maxSum = 0;
		int arr[] = { 2, 3, -8, 7, -1, 2, 3 };

		for (int i = 0; i < arr.length; i++) {
			currentSum = currentSum + arr[i];
			maxSum = Math.max(maxSum, currentSum);

			if (currentSum < 0) {
				currentSum = 0;

			}

		}

		System.out.println("The Sum of the Maximum sum of the subarray  :" + maxSum);
	}

}
