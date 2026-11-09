
import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        // First place elements according to arr2
        for (int num : arr2) {

            int count = map.get(num);

            while (count > 0) {
                arr1[index++] = num;
                count--;
            }

            map.remove(num);
        }

        // Collect remaining elements
        List<Integer> list = new ArrayList<>();

        for (int num : map.keySet()) {
            list.add(num);
        }

        // Sort remaining elements
        Collections.sort(list);

        // Add remaining elements to arr1
        for (int num : list) {

            int count = map.get(num);

            while (count > 0) {
                arr1[index++] = num;
                count--;
            }
        }

        return arr1;
    }
}
