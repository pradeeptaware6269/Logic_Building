package Day42;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6 {

	public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

		Map<Integer, Integer> mpp = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums1.length; i++) {

			mpp.put(nums1[i][0], nums1[i][1]);
		}
		for (int i = 0; i < nums2.length; i++) {

			mpp.put(nums2[i][0], mpp.getOrDefault(nums2[i][0], 0) + nums2[i][1]);

		}
		List<int[]> list = new ArrayList<>();

		for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {

			list.add(new int[] { entry.getKey(), entry.getValue() });
		}

		list.sort((a, b) -> Integer.compare(a[0], b[0]));

		return list.toArray(new int[list.size()][]);
	}

	public static void main(String[] args) {

		Task6 t = new Task6();

		int[][] nums1 = { { 1, 2 }, { 2, 3 }, { 4, 5 } };

		int[][] nums2 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };

		int[][] result = t.mergeArrays(nums1, nums2);

		for (int[] arr : result) {
			System.out.println(arr[0] + " " + arr[1]);
		}
	}
}