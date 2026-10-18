
class Solution {
    public int arrayNesting(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = nums[j];
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
