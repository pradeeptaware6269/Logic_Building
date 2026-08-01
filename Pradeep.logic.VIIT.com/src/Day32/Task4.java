package Day32;

import java.util.Arrays;

class Task4 {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Task4 s = new Task4();

		int nums[] = { 1, 2, 3, 1 };
		System.out.println(s.containsDuplicate(nums));
	}
}
