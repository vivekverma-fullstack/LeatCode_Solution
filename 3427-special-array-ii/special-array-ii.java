
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {

        int n = nums.length;

        int[] prefix = new int[n];

        // Count adjacent elements having same parity
        for (int i = 1; i < n; i++) {

            prefix[i] = prefix[i - 1];

            if (nums[i] % 2 == nums[i - 1] % 2) {
                prefix[i]++;
            }
        }

        boolean[] ans = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int left = queries[i][0];
            int right = queries[i][1];

            if (prefix[right] - prefix[left] == 0) {
                ans[i] = true;
            } else {
                ans[i] = false;
            }
        }

        return ans;
    }
}
