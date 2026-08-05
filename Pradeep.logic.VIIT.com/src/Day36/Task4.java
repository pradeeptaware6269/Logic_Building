package Day36;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<Integer> lst = new ArrayList<Integer>();

		List<List<Integer>> lst1 = new ArrayList<List<Integer>>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if (sum == 0) {
						lst.add(nums[i]);
						lst.add(nums[j]);
						lst.add(nums[k]);

						lst1.add(lst);
					}
				}
			}
		}
		return lst1;
	}

	public static void main(String[] args) {
		int arr[] = { -1, 0, 1, 2, -1, -4 };
		Task4 t = new Task4();
		System.out.println(t.threeSum(arr));
	}

}
