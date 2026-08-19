package Day41;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public List<Integer> eleMa(int[] nums) {

        int n = nums.length;

        int cnt = 0;
        int cnt1 = 0;

        int element = 0;
        int element1 = 0;

        // Find two possible candidates
        for (int i = 0; i < n; i++) {

            if (nums[i] == element) {
                cnt++;
            } 
            else if (nums[i] == element1) {
                cnt1++;
            } 
            else if (cnt == 0) {
                element = nums[i];
                cnt = 1;
            } 
            else if (cnt1 == 0) {
                element1 = nums[i];
                cnt1 = 1;
            } 
            else {
                cnt--;
                cnt1--;
            }
        }

        // Verify the candidates
        cnt = 0;
        cnt1 = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == element) {
                cnt++;
            }

            if (nums[i] == element1) {
                cnt1++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        if (cnt > n / 3) {
            ans.add(element);
        }

        if (cnt1 > n / 3 && element1 != element) {
            ans.add(element1);
        }

        return ans;
    }

    public static void main(String[] args) {

        Task4 t = new Task4();

        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3};

        System.out.println(t.eleMa(arr));
    }
}