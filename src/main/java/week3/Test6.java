package week3;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 931. 下降路径最小和
 * @date 2023/7/13 12:33:18
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6()
                .minFallingPathSum(new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}));
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        var f = new int[n][n + 2];
        System.arraycopy(matrix[0], 0, f[0], 1, n);
        for (int r = 1; r < n; r++) {
            f[r - 1][0] = f[r - 1][n + 1] = Integer.MAX_VALUE;
            for (int c = 0; c < n; c++)
                f[r][c + 1] = Math.min(Math.min(f[r - 1][c], f[r - 1][c + 1]), f[r - 1][c + 2]) + matrix[r][c];
        }
        int ans = Integer.MAX_VALUE;
        for (int c = 1; c <= n; c++)
            ans = Math.min(ans, f[n - 1][c]);
        return ans;
    }

}
