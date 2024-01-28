package mvdspk.java.blind75;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoSumTest {

    @Test
    public void testPairFound() {
        int nums[] = { 1, 2, 3, 4, 5 };

        int target = 3;

        TwoSum twoSum = new TwoSum();

        int pair[] = twoSum.usingHashMap(nums, target);

        assertEquals(1, pair[0]);
        assertEquals(0, pair[1]);
    }

    @Test
    public void testPairNotFoundIfArrayHasOneElement() {
        int nums[] = { 1 };

        int target = 3;

        TwoSum twoSum = new TwoSum();

        int pair[] = twoSum.usingHashMap(nums, target);

        assertEquals(-1, pair[0]);
        assertEquals(-1, pair[1]);
    }

    @Test
    public void testPairNotFoundIfEmptyArray() {
        int nums[] = {};

        int target = 3;

        TwoSum twoSum = new TwoSum();

        int pair[] = twoSum.usingHashMap(nums, target);

        assertEquals(-1, pair[0]);
        assertEquals(-1, pair[1]);
    }

    @Test
    public void testPairNotFound() {
        int nums[] = { 1, 2, 3, 4, 5 };

        int target = 15;

        TwoSum twoSum = new TwoSum();

        int pair[] = twoSum.usingHashMap(nums, target);

        assertEquals(-1, pair[0]);
        assertEquals(-1, pair[1]);
    }
}
