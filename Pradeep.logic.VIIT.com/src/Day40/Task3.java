package Day40;

public class Task3 {

	public void leader(int nums[]) {
		int n = nums.length;
		int max = nums[n - 1];
		System.out.println(max + " ");

		for (int i = n - 1; i > 0; i--) {
			if (nums[i] >= max) {
				max = nums[i];
				System.out.print(max + " ");
			}

		}
	}

	public static void main(String[] args) {
		Task3 t = new Task3();
		int arr[] = { 10, 22, 12, 3, 0, 6 };
		t.leader(arr);

	}

}
