package Day41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task6 {

	public List<List<Integer>> threeSum(int[] nums) {

		int n = nums.length;

		Set<List<Integer>> set = new HashSet<>();

		for (int i = 0; i < n; i++) {

			Set<Integer> hashset = new HashSet<>();

			for (int j = i + 1; j < n; j++) {

				int third = -(nums[i] + nums[j]);

				if (hashset.contains(third)) {

					List<Integer> temp = new ArrayList<>();

					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(third);

					temp.sort(null);

					set.add(temp);
				}
				hashset.add(nums[j]);
			}
		}
		return new ArrayList<>(set);
	}

	public static void main(String[] args) {

		int arr[] = { -1, 0, 1, 2, -1, -4 };
		Task5 t = new Task5();
		System.out.println(t.threeSum(arr));

	}
}