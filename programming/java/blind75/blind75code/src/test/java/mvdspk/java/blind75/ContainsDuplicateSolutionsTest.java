package mvdspk.java.blind75;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import mvdspk.java.arrays.ContainsDuplicateSolutions;

public class ContainsDuplicateSolutionsTest {

    @Test
    public void testUsingSortReturnsTrue() {

        int nums[] = { 1, 2, 3, 4, 5, 1 };

        ContainsDuplicateSolutions solution = new ContainsDuplicateSolutions();

        assertTrue(solution.usingSort(nums));

    }

    @Test
    public void testUsingSortReturnsFalse() {
        ContainsDuplicateSolutions solution = new ContainsDuplicateSolutions();

        int nums[] = null;
        assertFalse(solution.usingSort(nums));

        int nums2[] = {};
        assertFalse(solution.usingSort(nums2));

        int nums3[] = {1};
        assertFalse(solution.usingSort(nums3));

        int nums4[] = { 1, 2, 3, 4, 5 };
        assertFalse(solution.usingSort(nums4));
    }
}
