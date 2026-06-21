package Day3Task;

import java.util.Scanner;

public class Task2_Pattern_task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = n - 1; j >= i; i--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (k == 1 && k == i) {
					System.out.print("1 ");
				} else {
					System.out.print(k);
				}
			}
			System.out.println();
		}
	}

}
