package week7;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 1289. 下降路径最小和 II
 * @date 2023/8/11 12:19:45
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1()
                .minFallingPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        min = Math.min(min, grid[i - 1][k]);
                    }
                }
                grid[i][j] += min;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i : grid[n - 1]) {
            ans = Math.min(ans, i);
        }
        return ans;
    }
}
