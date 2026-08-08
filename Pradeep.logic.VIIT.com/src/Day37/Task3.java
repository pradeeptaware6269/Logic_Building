package Day37;

import java.util.HashMap;
import java.util.Arrays;

public class Task3 {

    public int[] twoSum(int[] nums) {

        int target = 14;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (mpp.containsKey(diff)) {
                return new int[] { mpp.get(diff), i };
            }

            mpp.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        int nums[] = {2, 7, 11, 15, 3};

        Task3 t = new Task3();

        System.out.println(Arrays.toString(t.twoSum(nums)));
    }
}