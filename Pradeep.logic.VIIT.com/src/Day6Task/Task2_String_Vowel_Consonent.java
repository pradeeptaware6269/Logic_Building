package Day6Task;

import java.util.Scanner;

public class Task2_String_Vowel_Consonent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();

		int vow = 0, conso = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vow++;
				System.out.println("Vowel is :" + ch);
			} else {
				conso++;
				System.out.println("The consonant is :" + ch);
			}
		}
		System.out.println("The Total Number of vowels in the string is :" + vow);
		System.out.println("The Total Number od consonant in the string is :" + conso);
	}

}
