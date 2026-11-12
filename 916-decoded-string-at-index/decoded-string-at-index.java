
class Solution {
    public String decodeAtIndex(String s, int k) {

        long length = 0;

        // Step 1: Calculate decoded string length
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                length *= ch - '0';
            } else {
                length++;
            }
        }

        // Step 2: Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            k %= length;

            if (k == 0 && Character.isLetter(ch)) {
                return String.valueOf(ch);
            }

            if (Character.isDigit(ch)) {
                length /= ch - '0';
            } else {
                length--;
            }
        }

        return "";
    }
}
