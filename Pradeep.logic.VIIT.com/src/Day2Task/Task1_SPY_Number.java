package Day2Task;

import java.util.Scanner;

public class Task1_SPY_Number {
	public static void main(String[] args) {
		int num, mul = 1, sum = 0, digit = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number  :");
		num = sc.nextInt();

		while (num > 0) {
			digit = num % 10;
			mul = digit * mul;
			sum = sum + digit;
			num = num / 10;

		}

		if (mul == sum) {
			System.out.println("Given number is SPY Number ok !!!! ");
		} else {
			System.out.println("Given number is Not SPY Nyumber ok  !!!! ");
		}

	}

}
