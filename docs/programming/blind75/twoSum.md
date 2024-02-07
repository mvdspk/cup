# Two Sum
Given an `array of numbers`, and a int `target`, return indices  `[i,j]` suh that `arr[i] + arr[j] = target`

## Solutions
|id|solution|time complexity|space complexity
|---|---|---|---|
|1| use hashmap| n|n
|2|sort and check for neighbor item same| nlogn + n = nlogn|1 no additionalspace used
|3|brute force| n^2|1

## Tests

### Test 1: Pair Found
input: nums = [1, 2, 3, 4, 5 ], target = 3
output: pair = [0,1]


### Test 2: Pair Not Found
input: nums = [1, 2, 3, 4, 5 ], target = 15
output: pair = [-1,-1]


### Test 3: Empty array
input: nums = [], target = 3
output: pair = [-1,-1]

### Test 3: single element array
input: nums = [1], target = 3
output: pair = [-1,-1]


```java
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
```