package week2;

import java.util.PriorityQueue;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 2679. 矩阵中的和
 * @date 2023/7/4 00:52:27
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1()
                .matrixSum(new int[][]{{7, 2, 1}, {6, 4, 2}, {6, 5, 3}, {3, 2, 1}}));
    }
    public int matrixSum(int[][] nums) {
        int res = 0;
        int m = nums.length;
        int n = nums[0].length;
        PriorityQueue<Integer>[] pq = new PriorityQueue[m];
        for (int i = 0; i < m; i++) {
            pq[i] = new PriorityQueue<>((a, b) -> b - a);
            for (int j = 0; j < n; j++) {
                pq[i].offer(nums[i][j]);
            }
        }

        for (int j = 0; j < n; j++) {
            int maxVal = 0;
            for (int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, pq[i].poll());
            }
            res += maxVal;
        }
        return res;

    }
}

