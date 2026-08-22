package Day42;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public List<List<Integer>> fourSum(int[] nums, int target) {

		List<List<Integer>> lst1 = new ArrayList<List<Integer>>();

		int n = nums.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++)

			{
				for (int k = j + 1; k < n; k++) {
					for (int l = k + 1; l < n; l++) {

						if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
							List<Integer> lst = new ArrayList<Integer>();
							lst.add(nums[i]);
							lst.add(nums[j]);
							lst.add(nums[k]);
							lst.add(nums[l]);

							lst1.add(lst);
						}
					}
				}

			}
		}
		return lst1;

	}

	public static void main(String[] args) {
		Task1 t = new Task1();
		int arr[] = { 1, 0, -1, 0, -2, 2 };
		System.out.println(t.fourSum(arr, 0));

	}

}
