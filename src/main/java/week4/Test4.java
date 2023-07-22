package week4;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 918. 环形子数组的最大和
 * @date 2023/7/20 14:40:18
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().
                maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
    }
    public int maxSubarraySumCircular(int[] nums) {
        int maxS = Integer.MIN_VALUE; // 最大子数组和，不能为空
        int minS = 0; // 最小子数组和，可以为空
        int maxF = 0, minF = 0, sum = 0;
        for (int x : nums) {
            // 以 nums[i-1] 结尾的子数组选或不选（取 max）+ x = 以 x 结尾的最大子数组和
            maxF = Math.max(maxF, 0) + x;
            maxS = Math.max(maxS, maxF);
            // 以 nums[i-1] 结尾的子数组选或不选（取 min）+ x = 以 x 结尾的最小子数组和
            minF = Math.min(minF, 0) + x;
            minS = Math.min(minS, minF);
            sum += x;
        }
        return sum == minS ? maxS : Math.max(maxS, sum - minS);
    }
}
