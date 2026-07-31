package Day32;

class Solution {
    public char findTheDifference(String s, String t) {

        int sum1 = 0;
        for (int i = 0; i < s.length(); i++) {
            sum1 += s.charAt(i);
        }

        int sum2 = 0;
        for (int i = 0; i < t.length(); i++) {
            sum2 += t.charAt(i);
        }

        char ch = (char) (sum2 - sum1);

        return ch;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        char ans = obj.findTheDifference("abcd", "abcde");

        System.out.println(ans);
    }
}