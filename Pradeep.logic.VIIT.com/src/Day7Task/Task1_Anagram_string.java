package Day7Task;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_Anagram_string {
//9.	Check anagram strings 
	public static void main(String[] args) {
		System.out.println("----- Here we are checking the both String are the anagram or not -------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String Here :");
		String s1 = sc.next();

		System.out.println("Enter the second String Here :");
		String s2 = sc.next();

		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (ch1.equals(ch2)) {
			System.out.println("The Given String Anagram String :");
		} else {
			System.out.println("The Given String is not Anagram String :");
		}
	}
}
