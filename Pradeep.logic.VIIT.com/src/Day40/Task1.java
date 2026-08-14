package Day40;

public class Task1 {

    public void nextPermutation(int[] nums) {

        int ind = -1;
        int n = nums.length;

        // Step 1: Find breakpoint
        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // If no breakpoint, array is in descending order
        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 2: Find element greater than nums[ind]
        for (int i = n - 1; i > ind; i--) {

            if (nums[i] > nums[ind]) {

                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;

                break;
            }
        }

        // Step 3: Reverse the remaining part
        reverse(nums, ind + 1, n - 1);
    }

    public void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Task1 obj = new Task1();

        int[] nums = {1, 2, 3};

        obj.nextPermutation(nums);

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}