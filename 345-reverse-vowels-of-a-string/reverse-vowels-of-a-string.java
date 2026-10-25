class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer forward until a vowel is found
            while (left < right && !isVowel(word[left])) {
                left++;
            }
            
            // Move right pointer backward until a vowel is found
            while (left < right && !isVowel(word[right])) {
                right--;
            }
            
            // Swap the vowels
            if (left < right) {
                char temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                
                // Move both pointers inward after swapping
                left++;
                right--;
            }
        }
        
        return new String(word);
    }
    
    // Helper method to keep the main logic clean and fast
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}