package Day39;

public class Task1 {

	// better solution
	public int maxSubArray(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];

				max = Math.max(sum, max);
			}
		}

		return max;

	}

	// Better Solution
	public int maxSubArray1(int[] nums) {

		long sum = 0;
		long maxi = Long.MIN_VALUE;
		System.out.println(maxi);

		for (int i = 0; i < nums.length; i++) {

			sum += nums[i];

			if (sum > maxi) {
				maxi = sum;
			}

			if (sum < 0) {
				sum = 0;
			}
		}

		return (int) maxi;
	}

	// optimal solution

	public int maxSubArray2(int[] nums) {

		long sum = 0;
		long maxi = Long.MIN_VALUE;

		int ansStart = -1;
		int ansEnd = -1;
		int start = 0;

		for (int i = 0; i < nums.length; i++) {

			// Start a new subarray
			if (sum == 0) {
				start = i;
			}

			sum += nums[i];

			// Update maximum sum
			if (sum > maxi) {
				maxi = sum;
				ansStart = start;
				ansEnd = i;
			}

			// If sum becomes negative, reset it
			if (sum < 0) {
				sum = 0;
			}
		}

		System.out.println("Maximum Sum: " + maxi);
		System.out.println("Start Index: " + ansStart);
		System.out.println("End Index: " + ansEnd);

		return (int) maxi;
	}

	public static void main(String[] args) {
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		Task1 t = new Task1();
		System.out.println(t.maxSubArray1(arr));

	}

}
