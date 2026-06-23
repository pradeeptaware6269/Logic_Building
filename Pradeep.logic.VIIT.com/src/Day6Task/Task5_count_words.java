package Day6Task;

import java.util.Scanner;

public class Task5_count_words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();

		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				continue;
			} else {
				count++;
			}
		}
		System.out.println("The Total Word of the String is   :" + count);
	}

}