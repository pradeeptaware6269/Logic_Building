package Day37;

import java.util.Arrays;

public class Task5 {

    public void twoSum(int nums[], int target) {

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            int sum = nums[i] + nums[j];

            if (sum == target) {
                System.out.println("The numbers are: " + nums[i] + " and " + nums[j]);
                return;
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }

        System.out.println("Target not found.");
    }

    public static void main(String[] args) {

        Task5 t = new Task5();

        int nums[] = {2, 7, 11, 15, 3};

        t.twoSum(nums, 14);
    }
}