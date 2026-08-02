package Day33;

public class Task1 {

	public int removeDuplicates(int[] nums) {

		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];

			}

		}
		return i + 1;

	}

	public static void main(String[] args) {

		Task1 t = new Task1();
		int nums[] = { 1, 1, 2 };
		int k = t.removeDuplicates(nums);

		System.out.println("After the Removing the DUplicate Elements : ");
		for (int i = 0; i < k; i++) {
			System.out.println(nums[i]);
		}

	}

}
