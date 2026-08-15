package Day40;

public class Task4 {

	// brute force solution
	public int consecutive(int nums[]) {
		int n = nums.length;
		int maxcount = 0;

		for (int i = 0; i < n; i++) {
			int count = 0;
			int current = nums[i];
			while (contains(nums, current)) {
				count++;
				current++;

			}
			maxcount = Math.max(maxcount, count);
		}
		return maxcount;
	}

	public boolean contains(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Task4 t = new Task4();
		int nums[] = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
		System.out.println(t.consecutive(nums));

	}

}
