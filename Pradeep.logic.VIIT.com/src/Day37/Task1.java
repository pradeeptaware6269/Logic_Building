package Day37;

public class Task1 {
//	public int jump(int[] nums) {
//
//		int temp = 0;
//
//		if (nums.length == 1) {
//			temp = 1;
//		} else {
//			for (int i = 0; i < nums.length; i++) {
//				i = i + nums[i];
//				temp++;
//			}
//		}
//		return temp;
//
//	}
//}

	public int jump(int[] nums) {

		if (nums.length == 1)
			return 0;

		int jumps = 0;
		int currentEnd = 0;
		int end = 0;

		for (int i = 0; i < nums.length - 1; i++) {

			end = Math.max(end, i + nums[i]);

			if (i == currentEnd) {
				jumps++;
				currentEnd = end;
			}
		}

		return jumps;
	}

	public static void main(String[] args) {
		Task1 t = new Task1();
		int arr[] = { 2, 3, 1, 1, 4 };
		System.out.println(t.jump(arr));
	}
}
