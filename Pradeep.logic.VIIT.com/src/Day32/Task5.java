package Day32;

import java.util.Arrays;

public class Task5 {
	public int majorityElement(int[] nums) {

		Arrays.sort(nums);
		int count = 1;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == nums[i + 1]) {
				count++;

			} else {
				count = 1;

			}
			if (count > (nums.length) / 2)
			{

				return nums[i];
			}
			else
			{
				return 1;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		Task5 t = new Task5();
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(t.majorityElement(nums));
	}
}
