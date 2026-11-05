class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            int totalWeight = 0;
            for (int i = 0; i < word.length(); i++) {
                totalWeight += weights[word.charAt(i) - 'a'];
            }
            int mod = totalWeight % 26;
            // 0 -> 'z', 1 -> 'y', ..., 25 -> 'a'
            char mappedChar = (char) ('z' - mod);
            result.append(mappedChar);
        }
        
        return result.toString();
    }
}