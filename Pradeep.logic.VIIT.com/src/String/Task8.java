package String;

public class Task8 {
	public String longestPalindrome(String s) {
		if (s == null || s.length() < 1) {
			return "";

		}
		int left = 0;
		int right = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = checkPalindrome(s, i, i);
			int len2 = checkPalindrome(s, i, i + 1);

			int len = Math.max(len1, len2);

			if (len > right + left) {
				left = i - (len - 1) / 2;
				right = i + len / 2;
			}
		}

		return s.substring(left, right+1);

	}

	public int checkPalindrome(String s, int left, int right) {
		int l = left;
		int r = right;
		while (l >= 0 && r < s.length()) {
			l--;
			r++;
		}
		return r - l - 1;
	}

	public static void main(String[] args) {
		
		Task8 t=new Task8();
		
	}

}
