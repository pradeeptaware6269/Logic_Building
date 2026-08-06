package Day37;

public class Task2 {

	public int maxArea(int[] height) {

		int count = 0;

		int max = height[0];

		for (int i = 0; i < height.length; i++) {

			if (max < height[i]) {
				max = height[i];
			}

		}

		int sol = height[height.length - 1];
		if (max > sol)
			return sol * sol;

		return max * max;
	}

	public static void main(String[] args) {
		int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		Task2 t = new Task2();
		System.out.println(t.maxArea(height));

	}

}
