package Day38;

public class Task1 {
	// Better solution for soring the 0's 1's and 2's
	public void sortColors(int[] nums) {

		int cnt0 = 0;
		int cnt1 = 0;
		int cnt2 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				cnt0++;

			} else if (nums[i] == 1) {
				cnt1++;
			} else {
				cnt2++;
			}
		}

		for (int i = 0; i < cnt0; i++) {
			nums[i] = 0;
		}

		for (int i = cnt0; i < cnt0 + cnt1; i++) {
			nums[i] = 1;
		}

		for (int i = cnt0 + cnt1; i < nums.length; i++) {
			nums[i] = 2;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 0, 2, 1, 1, 0 };
		Task1 t = new Task1();
		t.sortColors(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",  ");
		}

	}

}
