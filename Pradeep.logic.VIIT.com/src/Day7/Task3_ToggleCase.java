package Day7;

import java.util.Scanner;

public class Task3_ToggleCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1 here:");
		String str1 = sc.next();

		System.out.println("Enter the string 2 here :");
		String str2 = sc.next();

		System.out.println(str1 + "Now we can converting the uppercase " + str1.toUpperCase());
		System.out.println(str2 + " Now we can converting the lowercase " + str2.toLowerCase());
	}

}
