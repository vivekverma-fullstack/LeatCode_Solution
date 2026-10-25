class Solution {
    public int minimizedStringLength(String s) {
        boolean[] seen = new boolean[26];
        int Count = 0;

        for(char c : s.toCharArray()){
            if(!seen[ c - 'a']){
                seen[c - 'a'] = true;
                Count++;
            }
        }
        return Count;
    }
}