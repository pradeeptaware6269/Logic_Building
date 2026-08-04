package Day35;

public class Task1 {
	public void rotate(int[] nums, int k) {
		while (k > 0) {

			int temp = nums[0];
			for (int i = 0; i < nums.length - 1; i++) {
				nums[i] = nums[i + 1];

			}
			nums[nums.length - 1] = temp;
			k--;

		}
	}

	public static void main(String[] args) {
		Task1 t = new Task1();
		int nums[] = { 1, 2, 3, 4, 5 };
		t.rotate(nums, 2);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}

	}

}
