package String;

public class Task9 {

    public int countSubstrings(String s) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            
            ans += checkPalindrome(s, i, i);

           
            ans += checkPalindrome(s, i, i + 1);
        }

        return ans;
    }

    public int checkPalindrome(String s, int left, int right) {

        int count = 0;

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            count++;

            left--;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {

        Task9 obj = new Task9();

        String s = "aaa";

        System.out.println(obj.countSubstrings(s));
    }
}