package Day41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task7 {

	public List<List<Integer>> fourSum(int[] nums, int target) {

		int n = nums.length;

		Set<List<Integer>> set = new HashSet<>();

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				Set<Integer> hashset = new HashSet<>();

				for (int k = j + 1; k < n; k++) {

					int fourth = target - (nums[i] + nums[j] + nums[k]);

					if (hashset.contains(fourth)) {

						List<Integer> temp = new ArrayList<>();

						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[k]);
						temp.add(fourth);
						temp.sort(null);
						
						set.add(temp);
					}

					hashset.add(nums[k]);
				}
			}
		}

		return new ArrayList<>(set);
	}

	public static void main(String[] args) {
		Task7 t = new Task7();
		int arr[] = { 1, 0, -1, 0, -2, 2 };
		System.out.println(t.fourSum(arr, 0));
	}

}
