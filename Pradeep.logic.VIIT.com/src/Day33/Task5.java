package Day33;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public List<Integer> getRow(int rowIndex) {

		List<Integer> lst = new ArrayList<Integer>();

		for (int i = 0; i <= rowIndex; i++) {

			int num = 1;

			for (int j = 0; j <= i; j++) {

				if (i == rowIndex) {
					lst.add(num);
				}
				num = num * (i - j) / (j + 1);
			}

		}

		return lst;
	}

	public static void main(String[] args) {
		Task5 t = new Task5();
		System.out.println(t.getRow(3));

	}

}
