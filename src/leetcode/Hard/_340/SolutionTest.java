package leetcode.Hard._340;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void lengthOfLongestSubstringKDistinct() {
        assertEquals(3, solution.lengthOfLongestSubstringKDistinct("eceba", 2));
    }
}