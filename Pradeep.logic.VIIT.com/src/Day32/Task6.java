package Day32;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task6 {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> st = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			int count = 0;
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					st.add(nums1[i]);
					break;
					
				}

			}
		}
		
		int[] ans = new int[st.size()];
		int index = 0;

		for (int num : st) {
		    ans[index++] = num;
		}

		return ans;

	}

	public static void main(String[] args) {
		int num1[] = { 1, 2, 2, 1 };
		int num2[] = { 2, 2 };

		Task6 t = new Task6();
		System.out.println(Arrays.toString(t.intersection(num1, num2)));

	}
}
