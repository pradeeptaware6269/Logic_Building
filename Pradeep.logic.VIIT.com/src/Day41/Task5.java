package Day41;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public List<List<Integer>> threeSum(int[] nums) {

		int n = nums.length;

		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				for (int k = j + 1; k < n; k++) {

					if (nums[i] + nums[j] + nums[k] == 0) {

						List<Integer> lst = new ArrayList<>();

						lst.add(nums[i]);
						lst.add(nums[j]);
						lst.add(nums[k]);

						result.add(lst);
					}
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int arr[] = { -1, 0, 1, 2, -1, -4 };

		Task5 t = new Task5();

		System.out.println(t.threeSum(arr));
	}
}