package Day40;

import java.util.Arrays;

public class Task8 {

	public int[][] matrix(int arr[][]) {

		int n = arr.length;
		int m = arr[0].length;

		int row[] = new int[n];
		int col[] = new int[m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (arr[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (row[i] == 1 || col[j] == 1) {
					arr[i][j] = 0;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		Task8 t = new Task8();

		int result[][] = t.matrix(arr);

		System.out.println(Arrays.deepToString(result));
	}
}