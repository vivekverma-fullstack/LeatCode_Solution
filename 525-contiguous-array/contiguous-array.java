
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -2;
        }

        int count = 0;
        int maxLength = 0;
        int offset = n;

        arr[offset] = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }

            int index = count + offset;

            if (arr[index] != -2) {
                maxLength = Math.max(maxLength, i - arr[index]);
            } else {
                arr[index] = i;
            }
        }

        return maxLength;
    }
}