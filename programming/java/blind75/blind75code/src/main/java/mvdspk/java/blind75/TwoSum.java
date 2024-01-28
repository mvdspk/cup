package mvdspk.java.blind75;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] usingHashMap(int nums[], int target) {
        int pair[] = { -1, -1 };

        Map<Integer, Integer> lookup = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int otherNum = target - num;
            if (lookup.containsKey(otherNum)) {
                pair[0] = i;
                pair[1] = lookup.get(otherNum);
            } else {
                lookup.put(num, i);
            }
        }
        return pair;
    }
}
