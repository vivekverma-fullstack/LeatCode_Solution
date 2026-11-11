
class Solution {
    public String reversePrefix(String s, int k) {

        StringBuilder sb = new StringBuilder(s);

        // Reverse first k characters
        int left = 0;
        int right = k - 1;

        while (left < right) {

            char temp = sb.charAt(left);

            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }

        return sb.toString();
    }
}
