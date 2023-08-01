package week5;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 42. 接雨水
 * @date 2023/7/23 02:04:03
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1()
                .trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; ++i) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; --i) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }

}
