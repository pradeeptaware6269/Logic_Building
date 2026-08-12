package Day39;

import java.util.Arrays;
import java.util.Vector;

public class Task3 {
	public int[] rearrangeArray(int[] nums) {

		int n = nums.length;

		Vector<Integer> pos = new Vector<Integer>();
		Vector<Integer> neg = new Vector<Integer>();

		for (int i = 0; i < n; i++) {

			if (nums[i] > 0) {
				pos.add(nums[i]);
			} else {
				neg.add(nums[i]);
			}
		}

		int p = 0;
		int ng = 0;

		for (int i = 0; i < n; i++) {

			if (i % 2 == 0) {
				nums[i] = pos.get(p++);
			} else {
				nums[i] = neg.get(ng++);
			}
		}

		return nums;

	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, -2, -5, 2, -4 };
		Task3 t = new Task3();
		System.out.println(Arrays.toString(t.rearrangeArray(arr)));

	}

}
