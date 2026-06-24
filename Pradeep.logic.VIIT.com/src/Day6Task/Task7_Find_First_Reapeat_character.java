package Day6Task;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

//8. Find first non-repeated character 
public class Task7_Find_First_Reapeat_character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Sting :");
		String str = sc.next();
		LinkedHashSet<Character> h1 = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (h1.contains(ch)) {
				h1.remove(ch);
			} else {
				h1.add(ch);
			}
		}
		System.out.println("Here are simply priting the Non Repeated Character :");

		Iterator itr = h1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}

	}

}
