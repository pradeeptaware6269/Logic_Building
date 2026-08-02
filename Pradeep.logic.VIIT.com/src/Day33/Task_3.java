package Day33;

import java.util.ArrayList;
import java.util.List;

public class Task_3 {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> lst1 = new ArrayList<List<Integer>>();

		for (int i = 0; i < numRows; i++) {

			List<Integer> lst = new ArrayList<Integer>();

			int num = 1;

			for (int j = 0; j <= i; j++) {

				lst.add(num);

				num = num * (i - j) / (j + 1);
			}
			lst1.add(lst);

		}

		return lst1;
	}

	public static void main(String[] args) {
		Task_3 t = new Task_3();
		System.out.println(t.generate(5));

	}

}
