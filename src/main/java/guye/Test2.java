package guye;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description
 * @date 2023/7/27 11:11:06
 */
public class Test2 {
    public static void main(String[] args) {
        int n = 5; // 例如，有5阶楼梯
        int ways = countWays(6);
        System.out.println("总共有 " + ways + " 种走法");
    }

    public static int countWays(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            if (i >= 2) {
                dp[i] += dp[i - 2];
            }
            if (i >= 3) {
                dp[i] += dp[i - 3];
            }
            if (i >= 6) {
                dp[i] -= dp[i - 6];
            }
        }

        return dp[n];
    }
}
