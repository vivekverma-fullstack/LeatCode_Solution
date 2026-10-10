class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        
        // Traverse the string from right to left, stopping before the most significant bit.
        for (int i = s.length() - 1; i > 0; i--) {
            int currentBit = s.charAt(i) - '0';
            
            // If the current bit + carry is 1, the number is odd.
            // We need 1 step to add 1, and 1 step to divide by 2 (total 2 steps).
            // Adding 1 to an odd number will also create a carry for the next position.
            if ((currentBit + carry) == 1) {
                steps += 2;
                carry = 1; 
            } else {
                // If the current bit + carry is 0 or 2, the number is even.
                // We only need 1 step to divide by 2.
                // The carry remains 1 if it was 2, or 0 if it was 0.
                steps += 1;
            }
        }
        
        // At the most significant bit (index 0), it is '1' by default.
        // If we have a carry of 1, the number is effectively "10" at this point,
        // so we need 1 more step to divide by 2 and reach "1".
        return steps + carry;
    }
}