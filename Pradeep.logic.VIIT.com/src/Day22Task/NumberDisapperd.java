package Day22Task;

import java.util.Arrays;
import java.util.HashSet;

/*Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]*/
public class NumberDisapperd {

	public void disAppeard(int arr[]) {
		int min = arr[0];
		int n = arr.length;
		int max = arr[n - 1];

		HashSet<Integer> h = new HashSet<Integer>();

		for (Integer integer : arr) {
			h.add(integer);
		}
		System.out.println("Before Fiding the Element :");
		System.out.println(h);

		for (int i = min; i <= max; i++) {
			if (!(h.contains(i))) {
				h.add(i);
			}
		}
		System.out.println("After fiding the Element : ");
		System.out.println(h);
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		Arrays.sort(arr);
		NumberDisapperd d = new NumberDisapperd();
		d.disAppeard(arr);
	}
}
