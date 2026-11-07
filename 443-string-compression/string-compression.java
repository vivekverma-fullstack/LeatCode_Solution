
class Solution {
    public int compress(char[] chars) {

        int write = 0;
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            // Count repeating characters
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            // Write character
            chars[write++] = current;

            // Write count if greater than 1
            if (count > 1) {

                String num = String.valueOf(count);

                for (int j = 0; j < num.length(); j++) {
                    chars[write++] = num.charAt(j);
                }
            }
        }

        return write;
    }
}
