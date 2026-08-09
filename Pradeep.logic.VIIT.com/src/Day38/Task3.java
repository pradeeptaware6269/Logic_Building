package Day38;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public List<Integer> majorityElement(int[] nums) {
		List<Integer> lst = new ArrayList<Integer>();
		int el = 0;
		int cnt = 0;

		// Step 1: Find candidate
		for (int i = 0; i < nums.length; i++) {

			if (cnt == 0) {
				el = nums[i];
				cnt = 1;

			} else if (nums[i] == el) {
				cnt++;

			} else {
				cnt--;
			}
		}

		// Step 2: Verify candidate
		int cnt1 = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == el) {
				cnt1++;
			}
		}

		if (cnt1 > nums.length / 2) {
			lst.add(el);

		}
		return lst;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2 };
		Task3 t = new Task3();
		System.out.println(t.majorityElement(arr));

	}
}
