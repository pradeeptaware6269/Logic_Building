package Day40;

public class Task10 {

	public int subarraySum(int[] nums, int k) {

		int cnt = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + nums[i];
				if (sum == k) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Task10 t = new Task10();
		int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
		System.out.println(t.subarraySum(arr, 3));
	}
}
