class Solution {
    public String sortString(String s) {
        // Frequency array for lowercase English letters
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        StringBuilder result = new StringBuilder();
        int n = s.length();
        
        // Continue until we've processed all characters
        while (result.length() < n) {
            // Steps 1-3: Ascending pass
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    result.append((char) (i + 'a'));
                    freq[i]--;
                }
            }
            
            // Steps 4-6: Descending pass
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    result.append((char) (i + 'a'));
                    freq[i]--;
                }
            }
        }
        
        return result.toString();
    }
}