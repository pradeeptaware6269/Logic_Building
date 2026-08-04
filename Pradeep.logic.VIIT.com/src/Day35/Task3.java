package Day35;

import java.util.HashSet;

public class Task3 {

	public int numUniqueEmails(String[] emails) {

		HashSet<String> hst = new HashSet<String>();
		for (int i = 0; i < emails.length; i++) {
			hst.add(emails[i]);
		}
		System.out.print("[ ");
		for (String str : hst) {
			System.out.print(str + ", ");

		}
		System.out.print(" ]");
		return 0;

	}

	public static void main(String[] args) {
		String email[] = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };

		Task3 t = new Task3();
		t.numUniqueEmails(email);
	}

}
