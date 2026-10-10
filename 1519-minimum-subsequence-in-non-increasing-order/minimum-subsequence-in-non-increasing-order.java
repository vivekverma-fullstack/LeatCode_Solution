import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        List<Integer> result = new ArrayList<>();
        int currentSum = 0;
        
        // Iterate from the largest element down to the smallest
        for (int i = nums.length - 1; i >= 0; i--) {
            result.add(nums[i]);
            currentSum += nums[i];
            
            // Stop when the current sum is strictly greater than the remaining sum
            if (currentSum > totalSum - currentSum) {
                break;
            }
        }
        
        return result;
    }
}