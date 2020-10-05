package leetcode.Medium._73;

// https://leetcode.com/problems/set-matrix-zeroes/

public class Solution {
    //Time: O(m*n); Space: O(1)
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;

        int m = matrix.length;
        int n = matrix[0].length;
        boolean rowZero = false;
        boolean colZero = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if (i == 0) rowZero = true;
                    if (j == 0) colZero = true;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++)
                    matrix[i][j] = 0;
            }
        }

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++)
                    matrix[i][j] = 0;
            }
        }

        if (rowZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        if (colZero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
