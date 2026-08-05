package Day36;

import java.util.Arrays;

public class Task2 {

	public int[] plusOne(int[] digits) {

	    for (int i = digits.length - 1; i >= 0; i--) {

	        if (digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }

	        digits[i] = 0;
	    }

	    int[] result = new int[digits.length + 1];
	    result[0] = 1;

	    return result;
	}

	public static void main(String[] args) {

		Task2 t = new Task2();
		int[] arr = { 1, 2, 3, 9 };
		arr = t.plusOne(arr);
		System.out.println(Arrays.toString(arr));
	}
}