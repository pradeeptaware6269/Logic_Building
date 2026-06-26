package Day7Task;

import java.util.Scanner;

//13.Insert character at a specific position 
public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		StringBuilder str = new StringBuilder(sc.next());

		System.out.println("Enter the character :");
		char ch = sc.next().charAt(0);

		System.out.println("Enter the Position :");
		int pos = sc.nextInt();
		System.out.println(str.insert(pos, ch));

	}

}
