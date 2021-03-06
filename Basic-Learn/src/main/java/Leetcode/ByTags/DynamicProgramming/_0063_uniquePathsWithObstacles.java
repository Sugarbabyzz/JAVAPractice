package Leetcode.ByTags.DynamicProgramming;

import java.util.Arrays;

/**
 * 63. 不同路径 II
 * Medium
 */

public class _0063_uniquePathsWithObstacles {

    public static void main(String[] args) {

        int[][] obstacleGrid = {
                {1, 0},
                {1, 1},
                {0, 0}
        };
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        // 一、动态规划
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i-1][j] + dp[i][j-1];
            }
        }

        System.out.println(Arrays.deepToString(dp));
        return dp[m-1][n-1];
    }
}
