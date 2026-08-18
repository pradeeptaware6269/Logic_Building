package Day41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
	public List<Integer> majorityElement(int[] v) {

		List<Integer> ls = new ArrayList<>();
		Map<Integer, Integer> mpp = new HashMap<>();

		int n = v.length;
		int mini = (n / 3) + 1;

		for (int i = 0; i < n; i++) {

			mpp.put(v[i], mpp.getOrDefault(v[i], 0) + 1);

			if (mpp.get(v[i]) == mini) {
				ls.add(v[i]);
			}

			if (ls.size() == 2) {
				break;
			}
		}

		Collections.sort(ls);

		return ls;
	}

	public static void main(String[] args) {

		Task3 t = new Task3();
		int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3 };
		System.out.println(t.majorityElement(arr));

	}

}
