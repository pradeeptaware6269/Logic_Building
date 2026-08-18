package Day41;

public class Task2 {

	public int eleMa(int[] nums) {

		int n = nums.length;
		int cnt = 0;
		int element = nums[0];
		for (int i = 1; i < n; i++) {
			if (nums[i] == element) {
				cnt++;
				element = nums[i];
			} else {
				cnt--;
			}
		}

		int cnt1 = 0;
		for (int i = 0; i < n; i++) {
			if (element == nums[i]) {
				cnt1++;

			}
		}
		return cnt1;

	}

	public static void main(String[] args) {

		Task2 t = new Task2();
		int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3 };
		System.out.println(t.eleMa(arr));

	}

}
