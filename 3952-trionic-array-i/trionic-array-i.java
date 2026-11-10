
class Solution {
    public boolean isTrionic(int[] nums) {

        int n = nums.length;
        int i = 0;

        // Phase 1: Strictly Increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // First phase must contain at least one step
        if (i == 0) {
            return false;
        }

        // Phase 2: Strictly Decreasing
        int p = i;

        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }

        // Second phase must contain at least one step
        if (i == p) {
            return false;
        }

        // Phase 3: Strictly Increasing
        int q = i;

        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // Third phase must contain at least one step
        if (i == q) {
            return false;
        }

        return i == n - 1;
    }
}
