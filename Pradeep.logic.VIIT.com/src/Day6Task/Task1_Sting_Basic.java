package Day6Task;

import java.util.Scanner;

public class Task1_Sting_Basic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
		}
		System.out.println("The Total Number of the string is :" + count);
	}

}
