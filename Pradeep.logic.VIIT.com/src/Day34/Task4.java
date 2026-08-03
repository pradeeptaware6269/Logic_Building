package Day34;

import java.util.Arrays;

public class Task4 {

    public int[] singleNumber(int[] nums) {

        int[] arr = new int[2];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                arr[k] = nums[i];
                k++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        Task4 t = new Task4();

        int nums[] = {1, 2, 1, 3, 2, 5};

        System.out.println(Arrays.toString(t.singleNumber(nums)));
    }
}