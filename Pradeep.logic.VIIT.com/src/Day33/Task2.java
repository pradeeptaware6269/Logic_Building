package Day33;

public class Task2 {

	public int removeElement(int[] nums, int val) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {

				continue;

			} else {

				nums[j] = nums[i];
				j++;
			}
		}
		return j;

	}

	public static void main(String[] args) {
		Task2 t = new Task2();
		int nums[] = { 3, 2, 2, 3 };
		int k = t.removeElement(nums, 3);

		for (int i = 0; i < k; i++) {
			System.out.print(nums[i]);
		}

	}

}
