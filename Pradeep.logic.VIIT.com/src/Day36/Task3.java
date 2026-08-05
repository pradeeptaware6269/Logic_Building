package Day36;

import java.util.Arrays;

public class Task3 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;

		int[] arr = new int[m + n];

		for (int i = 0; i < m; i++) {
			arr[i] = nums1[i];
		}

		for (int i = 0; i < n; i++) {
			arr[m + i] = nums2[i];
		}

		Arrays.sort(arr);

		int len = arr.length;

		if (len % 2 == 1) {
			return arr[len / 2];
		} else {
			return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
		}
	}

	public static void main(String[] args) {
		int nums1[] = { 1, 2 };
		int nums2[] = { 3, 4 };

		Task3 t = new Task3();
		System.out.println(t.findMedianSortedArrays(nums1, nums2));
	}

}
