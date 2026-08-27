package String;

public class Task3 {
	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		int count[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		Task3 t = new Task3();
		System.out.println(t.isAnagram("anagram", "nagaram"));

	}

}
