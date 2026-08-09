
package Day38;

public class Task2 {

	public int majority(int[] arr) {

		int el = 0;
		int cnt = 0;

		// Step 1: Find candidate
		for (int i = 0; i < arr.length; i++) {

			if (cnt == 0) {
				el = arr[i];
				cnt = 1;

			} else if (arr[i] == el) {
				cnt++;

			} else {
				cnt--;
			}
		}

		// Step 2: Verify candidate
		int cnt1 = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == el) {
				cnt1++;
			}
		}

		if (cnt1 > arr.length / 2) {
			return el;
		}

		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 2, 2, 2, 3, 2, 2 };

		Task2 t = new Task2();

		int result = t.majority(arr);

		System.out.println("Majority Element: " + result);
	}
}
