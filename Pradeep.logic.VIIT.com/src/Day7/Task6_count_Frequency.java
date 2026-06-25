package Day7;

import java.util.HashSet;
import java.util.Scanner;
//input = aabbcc
//output = a=2  b=2  c=3
public class Task6_count_Frequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String :");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {

			int count = 1;

			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			HashSet<Character> h1 = new HashSet<Character>();
			if (h1.add(str.charAt(i))) {
				System.out.println(str.charAt(i) + " = " + count);
			}
		}
	}
}