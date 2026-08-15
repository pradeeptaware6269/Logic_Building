package Day40;

import java.util.Arrays;

public class Task5 {

	// Better solution

	public int consecutive(int nums[]) {

		int longest = 0;
		Arrays.sort(nums);
		int cnt = 0;
		int lastsmallest = Integer.MIN_VALUE;

		int n = nums.length;

		for (int i = 0; i < n; i++) {
			if (nums[i] == lastsmallest) {
				cnt++;
				lastsmallest = nums[i];

			} else if (nums[i] != lastsmallest) {
				cnt = 1;
				lastsmallest = nums[i];

			}
			longest = Math.max(longest, cnt);

		}
		return longest;

	}
}
