package Day40;

import java.util.ArrayList;
import java.util.List;

public class Task9 {

	public List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> lst = new ArrayList<Integer>();

		int n = matrix.length;
		int m = matrix[0].length;

		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = m - 1;

		while (top <= bottom && left <= right) {

			for (int j = left; j <= right; j++) {
				lst.add(matrix[top][j]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				lst.add(matrix[i][right]);
			}
			right--;

			if (top <= bottom) {
				for (int j = right; j >= left; j--) {
					lst.add(matrix[bottom][j]);
				}
				bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					lst.add(matrix[i][left]);
				}
				left++;
			}
		}

		return lst;
	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Task9 t = new Task9();

		System.out.println(t.spiralOrder(matrix));
	}
}