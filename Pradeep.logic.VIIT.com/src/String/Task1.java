package String;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
	public List<String> fizzBuzz(int n) {

		List<String> lst = new ArrayList<String>();

		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				lst.add("fizzBuzz");
			} else if (i % 3 == 0) {
				lst.add("fizz");

			} else if (i % 5 == 0) {
				lst.add("Buzz");

			} else {
				lst.add(Integer.toString(i));
			}
		}
		return lst;

	}

	public static void main(String[] args) {

		Task1 t = new Task1();
		System.out.println(t.fizzBuzz(45));

	}

}
