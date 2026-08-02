package Day33;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public List<List<Integer>> generate(int numRows) {
		List<Integer> lst = new ArrayList<Integer>();

		int k = 1;
		for (int i = 0; i < numRows; i++) {

			for (int a = numRows - i - 1; a > 0; a--) {
				System.out.print(" ");
			}
			
			int num = 1;
			
			for (int j = 0; j <= i; j++) {

				System.out.print(num + " ");

				num = num * (i - j) / (j + 1);
			}
			System.out.println();
		}

		return null;
	}

	public static void main(String[] args) {
		Task3 t = new Task3();
		t.generate(5);

	}

}
