package Day42;

import java.util.Arrays;

public class Task3 {

	public void missing(int[] nums) {

		int sum = 0;
		int duplicate = 0;

		Arrays.sort(nums);

		int n = nums.length;

		int expectedSum = n * (n + 1) / 2;

		for (int i = 0; i < n; i++) {

			if (i > 0 && nums[i] == nums[i - 1]) {

				duplicate = nums[i];

				System.out.println("Duplicate Element Found : " + nums[i]);
			}

			sum = sum + nums[i];
		}

		// Remove the duplicate from actual sum
		sum = sum - duplicate;

		int missing = expectedSum - sum;

		System.out.println("The missing number is : " + missing);
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6, 1 };

		Task3 t = new Task3();

		t.missing(arr);
	}
}