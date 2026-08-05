package Day36;

public class Task1 {
	public String longestCommonPrefix(String[] strs) {

		String prefix = strs[0];

		for (int i = 0; i < strs.length; i++) {

			while (!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		return prefix;

	}

	public static void main(String[] args) {

		Task1 t = new Task1();
		String strs[] = { "flower", "flow", "flight" };
		System.out.println(t.longestCommonPrefix(strs));

	}

}
