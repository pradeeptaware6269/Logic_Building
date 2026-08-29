package String;

import java.util.HashMap;
import java.util.Stack;

public class Task6 {

	public boolean isValid(String s) {

		HashMap<Character, Character> mpp = new HashMap<Character, Character>();
		mpp.put(')', '(');
		mpp.put(']', '[');
		mpp.put('}', '{');

		Stack<Character> stackt = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (!mpp.containsKey(c)) {
				stackt.push(c);
			} else {
				if (stackt.empty()) {
					return false;
				}
				char topelement = stackt.pop();
				if (topelement != mpp.get(c)) {
					return false;
				}

			}
		}
		return stackt.isEmpty();

	}

	public static void main(String[] args) {
		Task6 t = new Task6();
		System.out.println(t.isValid("([{}])"));

	}

}
