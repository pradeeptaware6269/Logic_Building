package Day33;

public class Task4 {
	public int searchInsert(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return nums.length;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 3, 5, 6 };
		Task4 t = new Task4();
		System.out.println(t.searchInsert(nums, 5));

	}

}
