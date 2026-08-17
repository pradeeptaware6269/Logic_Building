package Day40;

public class Task11 {

	public boolean checkSubarraySum(int[] nums, int k) {

		int n = nums.length;

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + nums[j];

				if (j - i + 1 >= 2 && sum % k == 0) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		Task11 t = new Task11();
		int nums[] = { 23, 2, 6, 4, 7 };
		System.out.println(t.checkSubarraySum(nums, 6));
	}

}
