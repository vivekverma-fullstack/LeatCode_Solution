
import java.util.*;

class Solution {

    public List<Integer> splitIntoFibonacci(String num) {

        List<Integer> result = new ArrayList<>();

        backtrack(num, 0, result);

        return result;
    }

    private boolean backtrack(String num, int index,
                              List<Integer> result) {

        // All digits are used
        if (index == num.length()) {
            return result.size() >= 3;
        }

        long number = 0;

        for (int i = index; i < num.length(); i++) {

            // Leading zero check
            if (i > index && num.charAt(index) == '0') {
                break;
            }

            number = number * 10 + (num.charAt(i) - '0');

            // 32-bit integer limit
            if (number > Integer.MAX_VALUE) {
                break;
            }

            // Fibonacci condition
            int size = result.size();

            if (size >= 2) {

                long sum = (long) result.get(size - 1)
                         + result.get(size - 2);

                if (number > sum) {
                    break;
                }

                if (number < sum) {
                    continue;
                }
            }

            result.add((int) number);

            if (backtrack(num, i + 1, result)) {
                return true;
            }

            // Backtracking
            result.remove(result.size() - 1);
        }

        return false;
    }
}
