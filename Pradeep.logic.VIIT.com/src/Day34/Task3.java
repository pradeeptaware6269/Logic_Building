package Day34;

public class Task3 {
	public int singleNumber(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}

			}
			if (count <= 1) {
				return nums[i];
			}
			count = 0;
		}
		return 0;
	}

//	public int singleNumber(int[] nums) {
//
//		int xor1 = 0;
//
//		for (int i = 0; i < nums.length; i++) {
//			xor1 ^= nums[i];
//		}
//		return xor1;
//
//	}

	public static void main(String[] args) {
		Task3 t = new Task3();
		int arr[] = { 1, 1, 2, 2, 3, 4, 4 };
		System.out.println(t.singleNumber(arr));
	}

}
