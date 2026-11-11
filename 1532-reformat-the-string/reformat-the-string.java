
class Solution {
    public String reformat(String s) {

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        // Separate letters and digits
        for (char ch : s.toCharArray()) {

            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                digits.append(ch);
            }
        }

        // Check whether reformatting is possible
        if (Math.abs(letters.length() - digits.length()) > 1) {
            return "";
        }

        // Decide which character type comes first
        StringBuilder result = new StringBuilder();

        if (letters.length() > digits.length()) {

            for (int i = 0; i < digits.length(); i++) {
                result.append(letters.charAt(i));
                result.append(digits.charAt(i));
            }

            result.append(letters.charAt(letters.length() - 1));

        } else {

            for (int i = 0; i < letters.length(); i++) {
                result.append(digits.charAt(i));
                result.append(letters.charAt(i));
            }

            if (digits.length() > letters.length()) {
                result.append(digits.charAt(digits.length() - 1));
            }
        }

        return result.toString();
    }
}
