package Day32;

class Task3 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] < nums2[j]) {
				nums1[k] = nums2[j];
				j--;
			} else {
				nums1[i + 1] = nums1[i];
				i--;
			}
			k--;
		}

	}

	public static void main(String[] args) {
		Task3 s = new Task3();
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };

		s.merge(nums1, 3, nums2, 3);

		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " , ");
		}
	}
}