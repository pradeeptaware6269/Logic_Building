package String;

public class Task7 {

	public boolean isPalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}

			if (Character.isLowerCase(left) != Character.isUpperCase(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}

	public static void main(String[] args) {

		Task7 t = new Task7();
		System.out.println(t.isPalindrome("mad:a:m"));

	}

}
