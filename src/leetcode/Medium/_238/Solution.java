package leetcode.Medium._238;

//https://leetcode.com/problems/product-of-array-except-self/

public class Solution {
    // Time: O(n); Space: O(n)
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] res = new int[len];

        res[0] = 1;

        for (int i = 1; i < len; i++) {
            res[i] = nums[i-1] * res[i-1];
        }

        int right = 1;
        for (int i = len - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right *= nums[i];
        }

        return res;
    }
}
