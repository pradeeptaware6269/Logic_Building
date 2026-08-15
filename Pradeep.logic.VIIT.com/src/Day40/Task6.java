package Day40;

import java.util.HashSet;
import java.util.Set;

public class Task6 {

	public int consecutive(int nums[]) {

		int longest = 0;

		int n = nums.length;
		Set<Integer> st = new HashSet<Integer>();

		int cnt = 0;
		int lastsmallest = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			st.add(nums[i]);
		}

		for (Integer ele : st) {

			if (!st.contains(ele - 1)) {

				cnt = 1;
				lastsmallest = ele;

				while (st.contains(lastsmallest + 1)) {
					cnt++;
					lastsmallest++;
				}

				longest = Math.max(longest, cnt);
			}
		}

		return longest;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 101, 100 };

		Task6 t = new Task6();

		System.out.println(t.consecutive(nums));
	}
}