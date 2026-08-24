package Day42;

import java.util.HashMap;
import java.util.Map;

public class Task4 {

	public int countGood(int[] nums, int k) {

		int xr = 0;
		int cnt = 0;

		Map<Integer, Integer> mpp = new HashMap<>();

		mpp.put(0, 1);

		for (int i = 0; i < nums.length; i++) {

			xr = xr ^ nums[i];
			int x = xr ^ k;
			if (mpp.containsKey(x)) {
				cnt += mpp.get(x);
			}
			mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
		}
		return cnt;
	}

	public static void main(String[] args) {

		Task4 t = new Task4();

		int arr[] = { 4, 2, 2, 3, 6 };

		int k = 6;

		System.out.println(t.countGood(arr, k));
	}
}