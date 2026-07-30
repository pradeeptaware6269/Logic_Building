package Striver3;

import java.util.Scanner;

// Debug the checkBirthDay() Function 
// (Return 1 if the birthday is 5th 
// July,otherwise 0)

public class Task7 {
	public int checkBirthDay(int date, String month) {
		if (date == 5 && month.equalsIgnoreCase("july")) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Task7 t = new Task7();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date Here :");
		int date = sc.nextInt();

		System.out.println("Enter the Month Here :");
		String month = sc.next();

		System.out.println(t.checkBirthDay(date, month));

	}

}
