package week4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 1499. 满足不等式的最大值
 * @date 2023/7/21 01:49:02
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6()
                .findMaxValueOfEquation(new int[][]{{1, 3}, {2, 0}, {5, 10}, {6, -10}}, 1));
    }
    public int findMaxValueOfEquation(int[][] points, int k) {
        int res = Integer.MIN_VALUE;
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int[] point : points) {
            int x = point[0], y = point[1];
            while (!heap.isEmpty() && x - heap.peek()[1] > k)
                heap.poll();
            if (!heap.isEmpty())
                res = Math.max(res, x + y - heap.peek()[0]);
            heap.offer(new int[]{x - y, x});
        }
        for (int[] ints : heap) {
            System.out.println(Arrays.toString(ints));
        }
        return 1;
    }
}
