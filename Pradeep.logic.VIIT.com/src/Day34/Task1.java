package Day34;

public class Task1 {

	public int missingNumber(int[] nums) {
		int n = nums.length;


		int totalSum = ((n + 1) * (n + 2)) / 2;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + nums[i];

		}

		return totalSum - sum;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5 };
		Task1 t = new Task1();
		System.out.println(t.missingNumber(arr));
	}

}
