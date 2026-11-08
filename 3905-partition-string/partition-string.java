
import java.util.*;

class Solution {
    public List<String> partitionString(String s) {

        List<String> result = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        StringBuilder current = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            current.append(s.charAt(i));

            String str = current.toString();

            if (!set.contains(str)) {

                result.add(str);
                set.add(str);

                current.setLength(0);
            }
        }

        return result;
    }
}
