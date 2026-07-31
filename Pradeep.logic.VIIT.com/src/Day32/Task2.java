package Day32;

import java.util.Arrays;

public class Task2 {

	public int thirdMax(int[] nums) {

		Arrays.sort(nums);
		int count = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.println(count + " Max is :" + nums[i]);
			count++;
		}

		return 0;

	}

	public static void main(String[] args) {
		Task2 t = new Task2();
		int arr[] = { 1, 3, 2 };
		t.thirdMax(arr);

	}

}
