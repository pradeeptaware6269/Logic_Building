package Day22Task;

/*
 * Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

*/
public class MajorityElement {

	public void major(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > n / 2) {
				System.out.println("The total Count is :" + count);
				System.out.println("The Majority Element is :" + arr[i]);
				return;
			}
		}
		System.out.println("There is no any more Majority Element ..... ");

	}

	public static void main(String[] args) {
		MajorityElement m = new MajorityElement();
		int arr[] = { 1, 2, 2, 2, 2, 2, 3, 7 };
		m.major(arr);
	}

}
