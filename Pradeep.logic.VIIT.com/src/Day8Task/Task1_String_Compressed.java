package Day8Task;

public class Task1_String_Compressed {
	public static void main(String[] args) {
		String str = "aaabbcc";
		String result = " ";
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				count++;
			} else {

				result = result + str.charAt(i - 1) + count;
				count = 1;
			}

		}

		result = result + str.charAt(str.length() - 1) + count;

		System.out.println(result);
	}
}