package Day34;

public class Task2 {
	public int findMaxConsecutiveOnes(int[] nums) {

		int count = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 1, 1, 1 };
		Task2 t = new Task2();
		System.out.println(t.findMaxConsecutiveOnes(arr));

	}

}
