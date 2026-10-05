

class Solution {
    public String oddString(String[] words) {
       int[] d0 = getDiff(words[0]);
        int[] d1 = getDiff(words[1]);
        int[] d2 = getDiff(words[2]);

        if (Arrays.equals(d0, d1)) {
            for (int i = 2; i < words.length; i++) {
                if (!Arrays.equals(d0, getDiff(words[i]))) {
                    return words[i];
                }
            }
        } else {
            if (Arrays.equals(d0, d2)) {
                return words[1];
            } else {
                return words[0];
            }
        }
        
        return "";
    }

    private int[] getDiff(String s) {
        int[] diff = new int[s.length() - 1];
        for (int i = 0; i < s.length() - 1; i++) {
            diff[i] = s.charAt(i + 1) - s.charAt(i);
        }
        return diff;
    }
}