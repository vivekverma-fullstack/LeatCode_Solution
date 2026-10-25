class Solution {
    public String largestOddNumber(String num) {
        // Scan from right to left to find the rightmost odd digit
        for (int i = num.length() - 1; i >= 0; i--) {
            // The ASCII value of an odd digit is always an odd number
            if (num.charAt(i) % 2 != 0) {
                // Return the substring from the start up to and including the odd digit
                return num.substring(0, i + 1);
            }
        }
        
        // If no odd digit is found, return an empty string
        return "";
    }
}