package Day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

	public List<List<Integer>> fourSum(int[] nums, int target) {

		Arrays.sort(nums);

		List<List<Integer>> lst1 = new ArrayList<List<Integer>>();

		int n = nums.length;

		for (int i = 0; i < n; i++) {

			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			for (int j = i + 1; j < n; j++) {

				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;

				int k = j + 1;
				int l = n - 1;

				while (k < l) {

					long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

					if (sum == target) {

						List<Integer> lst = new ArrayList<Integer>();

						lst.add(nums[i]);
						lst.add(nums[j]);
						lst.add(nums[k]);
						lst.add(nums[l]);

						lst1.add(lst);

						k++;
						l--;

						while (k < l && nums[k] == nums[k - 1]) {
							k++;
						}

						while (k < l && nums[l] == nums[l + 1]) {
							l--;
						}

					} else if (sum < target) {

						k++;

					} else {

						l--;
					}
				}
			}
		}

		return lst1;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 0, -1, 0, -2, 2 };

		Task2 t = new Task2();

		System.out.println(t.fourSum(arr, 0));
	}
}