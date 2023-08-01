package week5;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 2500. 删除每行中的最大值
 * @date 2023/7/27 01:00:54
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().
                deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
    }
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int[] ints : grid) {
            Arrays.sort(ints);
        }
        int res = 0;
        for (int j = 0; j < n; j++) {
            int mx = 0;
            for (int[] ints : grid) {
                mx = Math.max(mx, ints[j]);
            }
            res += mx;


        }
        return res;
    }
}
