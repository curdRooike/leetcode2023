package week3;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 打家劫舍
 * @date 2023/7/12 18:15:14
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().rob(new int[]{2, 7, 9, 3, 1}));
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
}
