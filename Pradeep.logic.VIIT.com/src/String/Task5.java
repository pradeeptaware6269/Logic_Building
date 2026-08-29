package String;

public class Task5 {

	public boolean isValid(String s) {

		int n = s.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				count += ch;
			}

			else {
				count -= ch;
			}
		}
		if (count == 0) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		Task5 t = new Task5();
		System.out.println(t.isValid("()"));
	}

}
